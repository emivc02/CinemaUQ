package co.edu.uniquindio.poo.proyecto.model;

public class Pelicula {

    private String codigo;
    private String titulo;
    private int duracionMin;
    private String sinopsis;

    public Pelicula(String codigo, String titulo, int duracionMin, String sinopsis) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.sinopsis = sinopsis;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", duracionMin=" + duracionMin +
                ", sinopsis='" + sinopsis + '\'' +
                '}';
    }
}
