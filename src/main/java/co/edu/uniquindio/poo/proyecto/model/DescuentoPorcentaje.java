package co.edu.uniquindio.poo.proyecto.model;

import java.time.DayOfWeek;

public class DescuentoPorcentaje {
    private DayOfWeek dia;
    private double porcentaje;

    public DescuentoPorcentaje(DayOfWeek dia, double porcentaje) {
        this.dia = dia;
        this.porcentaje = porcentaje;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    //Metodos
}
