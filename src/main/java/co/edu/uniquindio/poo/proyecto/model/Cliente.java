package co.edu.uniquindio.poo.proyecto.model;

public class Cliente extends Usuario{

    private String telefono;

    public Cliente(String id, String nombre, String correo, String contrasena, String telefono) {
        super(id, nombre, correo, contrasena);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                '}';
    }
}
