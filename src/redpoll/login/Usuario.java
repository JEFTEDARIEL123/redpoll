package redpoll.login;

/**
 *
 * @author Luis Villalobos
 */
public class Usuario {
    private String correo;
    private String contraseña;

    public Usuario(String nombre, String correo, String contraseña, String confirmacionCorreo, String confirmacionContraseña) {
        setCorreo(correo, confirmacionCorreo);
        setContraseña(contraseña, confirmacionContraseña);
    }


    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setCorreo(String correo, String confirmacionCorreo) {
        if (correo.equals(confirmacionCorreo)) {
            this.correo = correo;
        } else {
            System.out.println("Error: Los correos no coinciden.");
        }
    }

    public void setContraseña(String contraseña, String confirmacionContraseña) {
        if (contraseña.equals(confirmacionContraseña)) {
            this.contraseña = contraseña;
        } else {
            System.out.println("Error: Las contraseñas no coinciden.");
        }
    }
}
