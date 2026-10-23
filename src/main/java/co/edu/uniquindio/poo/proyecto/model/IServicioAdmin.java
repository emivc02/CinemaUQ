package co.edu.uniquindio.poo.proyecto.model;

public interface IServicioAdmin {
    public void recargarTarjeta (Cliente cliente, double valor );
    public void cancelarFuncion (Funcion f) ;
    public void registrarPelicula (Pelicula p) ;
    public void registrarFuncion (Funcion f);
}
