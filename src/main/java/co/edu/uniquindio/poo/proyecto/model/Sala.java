package co.edu.uniquindio.poo.proyecto.model;

public class Sala {
    private int numero;
    private int capacidad;

    public Sala(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numero=" + numero +
                ", capacidad=" + capacidad +
                '}';
    }
}
