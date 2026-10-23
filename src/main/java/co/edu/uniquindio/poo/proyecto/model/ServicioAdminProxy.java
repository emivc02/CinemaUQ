package co.edu.uniquindio.poo.proyecto.model;

public class ServicioAdminProxy implements  IServicioAdmin{
    private ServicioAdmin servicioReal;
    private Usuario usuarioActual;

    @Override
    public void recargarTarjeta(Cliente cliente, double valor) {

    }

    @Override
    public void cancelarFuncion(Funcion f) {

    }

    @Override
    public void registrarPelicula(Pelicula p) {

    }

    @Override
    public void registrarFuncion(Funcion f) {

    }
    private void verificarPermiso ( ) {

    }
}
