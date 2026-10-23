package co.edu.uniquindio.poo.proyecto.model;

public abstract class Usuario {
    private String id;
    private String nombre;
    private String correo;
    private String Contrasena;

    public Usuario(String id, String nombre, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        Contrasena = contrasena;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", Contrasena='" + Contrasena + '\'' +
                '}';
    }
}
