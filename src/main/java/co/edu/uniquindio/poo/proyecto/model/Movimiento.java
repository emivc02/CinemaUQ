package co.edu.uniquindio.poo.proyecto.model;

import java.time.LocalDateTime;

public class Movimiento {
    private String id;
    private double valor;
    private LocalDateTime fecha;
    private String descripcion;
    private TipoMovimiento tipo;

    public Movimiento(String id, double valor, LocalDateTime fecha, String descripcion, TipoMovimiento tipo) {
        this.id = id;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }

    //metodos
}
