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
public class Role {
    //Identifacador propio del Role
    private int idRole;
    //Nombre, ej Veterinario
    private String NombreRole;
    //Lista de Permisos
    private Boolean vacunas;

    @Override
    public String toString() {
        return "Permisos{" + "Vacunas=" + vacunas + '}';
    }

    public Role(int idRole, String NombreRole,Boolean vacunas) {
        this.idRole = idRole;
        this.NombreRole = NombreRole;
        this.vacunas = vacunas;
    }


    public int getId() {
        return idRole;
    }

    public String getNombreRole() {
        return NombreRole;
    }

    public void setNombreRole(String NombreRole) {
        this.NombreRole = NombreRole;
    }

    public void setVacunas(Boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Boolean getVacunas() {
        return vacunas;
    }

    
}
