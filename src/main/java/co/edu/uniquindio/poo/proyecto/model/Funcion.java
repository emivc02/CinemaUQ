package co.edu.uniquindio.poo.proyecto.model;

import java.time.LocalDate;

public class Funcion {
    private String id;
    private LocalDate fecha;
    private double precioBase;
    private boolean cancelada;
    private Pelicula pelicula;
    private sala Sala;
    private Set<Asiento> asientosOcupados;

    public Funcion(String id, LocalDate fecha, double precioBase, boolean cancelada, Pelicula pelicula, sala sala, Set<Asiento> asientosOcupados) {
        this.id = id;
        this.fecha = fecha;
        this.precioBase = precioBase;
        this.cancelada = cancelada;
        this.pelicula = pelicula;
        Sala = sala;
        this.asientosOcupados = asientosOcupados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isCancelada() {
        return cancelada;
    }

    public void setCancelada(boolean cancelada) {
        this.cancelada = cancelada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public sala getSala() {
        return Sala;
    }

    public void setSala(sala sala) {
        Sala = sala;
    }

    public Set<Asiento> getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(Set<Asiento> asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
    }

    //metodos
}
