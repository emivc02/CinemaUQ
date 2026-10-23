package co.edu.uniquindio.poo.proyecto.model;

public class Administrador extends Usuario{

    private String cargo;

    public Administrador(String id, String nombre, String correo, String contrasena, String cargo) {
        super(id, nombre, correo, contrasena);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
