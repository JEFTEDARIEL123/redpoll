package redpoll;


public class Usuario {
    private int idUsuario,idRol;
    private String nombre,correo,password;

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", idRol=" + idRol + ", nombre=" + nombre + ", correo=" + correo + ", password=" + password + '}';
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(int idUsuario, int idRol, String nombre, String correo, String password) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }
    
    
}
