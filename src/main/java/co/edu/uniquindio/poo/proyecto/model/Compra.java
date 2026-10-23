package co.edu.uniquindio.poo.proyecto.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Compra {

    private String id;
    private Cliente cliente;
    private LocalDateTime fecha;
    private List<Entrada> entradas;
    private List<DetalleConfiteria> detallesConfiteria;
    private double subtotal;
    private double total;
    private String estado;
    private boolean reembolsada;

    /**
     * Metodo constructor que permite crear compras de forma flexible
     * @param builder
     */
    public Compra(CompraBuilder builder) {
        this.id = UUID.randomUUID().toString();
        this.cliente = builder.cliente;
        this.fecha = LocalDateTime.now();
        this.detallesConfiteria = builder.items;
        this.estado = "PENDIENTE";
        this.reembolsada = false;

        // Se crea una entrada por cada asiento
        this.entradas = new ArrayList<>();
        for (Asiento asiento : builder.asientos) {
            entradas.add(new Entrada(builder.funcion, asiento));
        }

        // Subtotal de las entradas mas el subtotal de la confiteria
        double subtotalEntradas = builder.precio * builder.asientos.size();
        double subtotalConfiteria = 0;
        for (DetalleConfiteria detalle : detallesConfiteria) {
            subtotalConfiteria += detalle.getSubtotal();
        }
        this.subtotal = subtotalEntradas + subtotalConfiteria;
        this.total = this.subtotal;
    }

    /**
     * Metodo que asigna el estado de la compra
     * @param estado de la compra
     */
    public void estado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo que asigna si la compra fue reembolsada
     * @param reembolsada true si la compra fue reembolsada
     */
    public void reembolsada(boolean reembolsada) {
        this.reembolsada = reembolsada;
    }

    //Getter
    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public List<DetalleConfiteria> getDetallesConfiteria() {
        return detallesConfiteria;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public String getEstado() {
        return estado;
    }

    public boolean isReembolsada() {
        return reembolsada;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id='" + id + '\'' +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", entradas=" + entradas +
                ", detallesConfiteria=" + detallesConfiteria +
                ", subtotal=" + subtotal +
                ", total=" + total +
                ", estado='" + estado + '\'' +
                ", reembolsada=" + reembolsada +
                '}';
    }

    public static class CompraBuilder {
        private Cliente cliente;
        private Funcion funcion;
        private List<Asiento> asientos;
        private List<DetalleConfiteria> items = new ArrayList<>();
        private double precio;

        /**
         * Metodo que permite construir el cliente de la compra
         * @param cliente de la compra
         * @return CompraBuilder
         */
        public CompraBuilder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public CompraBuilder funcion(Funcion funcion) {
            this.funcion = funcion;
            return this;
        }

        public CompraBuilder asientos(List<Asiento> asientos) {
            this.asientos = asientos;
            return this;
        }

        public CompraBuilder items(List<DetalleConfiteria> items) {
            this.items = items;
            return this;
        }

        public CompraBuilder precio(double precio) {
            this.precio = precio;
            return this;
        }

        /**
         * Metodo que valida los datos obligatorios y construye la compra
         * @return Compra
         */
        public Compra build() {
            if (cliente == null) {
                throw new IllegalArgumentException("El cliente es obligatorio");
            }
            if (funcion == null) {
                throw new IllegalArgumentException("La funcion es obligatoria");
            }
            if (asientos == null || asientos.isEmpty()) {
                throw new IllegalArgumentException("Debe seleccionar al menos un asiento");
            }
            if (precio <= 0) {
                throw new IllegalArgumentException("El precio debe ser mayor a cero");
            }
            return new Compra(this);
        }
    }
}