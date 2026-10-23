package co.edu.uniquindio.poo.proyecto.model;

import java.util.List;

public class TarjetaVirtual {
    private String numero;
    private double Saldo;
    private boolean activa;
    private List<Movimiento> movimientos;

    public TarjetaVirtual(String numero, double saldo, boolean activa) {
        this.numero = numero;
        Saldo = saldo;
        this.activa = activa;
        this.movimientos = movimientos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return "TarjetaVirtual{" +
                "numero='" + numero + '\'' +
                ", Saldo=" + Saldo +
                ", activa=" + activa +
                ", movimientos=" + movimientos +
                '}';
    }
}
