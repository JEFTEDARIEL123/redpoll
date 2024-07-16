/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.roles;
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
    private Boolean animales, chequeos, grupos, produccion, propietarios, vacunas;

    @Override
    public String toString() {
        return "Permisos{" + "Vacunas=" + vacunas + '}';
    }

    public Role(int idRole, String NombreRole,Boolean animales, Boolean chequeos, Boolean grupos, Boolean produccion, Boolean propietarios, Boolean vacunas) {
        this.idRole = idRole;
        this.NombreRole = NombreRole;
        this.animales = animales;
        this.chequeos = chequeos;
        this.grupos = grupos;
        this.produccion = produccion;
        this.propietarios = propietarios;
        this.vacunas = vacunas;
        
    }


    public int getId() {
        return idRole;
    }

    public String getNombreRole() {
        return NombreRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public Boolean getAnimales() {
        return animales;
    }

    public Boolean getChequeos() {
        return chequeos;
    }

    public Boolean getGrupos() {
        return grupos;
    }

    public Boolean getProduccion() {
        return produccion;
    }

    public Boolean getPropietarios() {
        return propietarios;
    }

    public Boolean getVacunas() {
        return vacunas;
    }

    
}
