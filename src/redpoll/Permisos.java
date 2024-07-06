/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Permisos {
    private List<Boolean> permiso;

    @Override
    public String toString() {
        return "Permisos{" + "permiso=" + permiso + '}';
    }

    public Permisos(List<Boolean> permiso) {
        this.permiso = permiso;
    }

    public List<Boolean> getPermiso() {
        return permiso;
    }

    public void setPermiso(List<Boolean> permiso) {
        this.permiso = permiso;
    }
    
}
