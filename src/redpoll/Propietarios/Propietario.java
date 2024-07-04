package redpoll.Propietarios;


public class Propietario {
    private int ID;
    
    private String Nombre;
    
    private int Cedula;
    
    private int Telefono;
    
    private String Direccion;
    
    private String Correo;

    public Propietario(int ID, String Nombre, int Cedula, int Telefono, String Direccion, String Correo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo = Correo;
    }

    public Propietario() {
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "Propietario{" + "ID=" + ID + ", Nombre=" + Nombre + ", Cedula=" + Cedula + ", Telefono=" + Telefono + ", Direccion=" + Direccion + ", Correo=" + Correo + '}';
    }
    
    
    
}
