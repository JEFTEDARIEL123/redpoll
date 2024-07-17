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
    private Boolean animales, chequeos, grupos, produccion, propietarios, vacunas, usuarios, reportes;

    @Override
    public String toString() {
        return "Permisos{" + "Vacunas=" + vacunas + '}';
    }

    public Role(int idRole, String NombreRole,Boolean animales, Boolean chequeos, Boolean grupos, Boolean produccion, Boolean propietarios, Boolean vacunas, Boolean usuarios, Boolean reportes) {
        this.idRole = idRole;
        this.NombreRole = NombreRole;
        this.animales = animales;
        this.chequeos = chequeos;
        this.grupos = grupos;
        this.produccion = produccion;
        this.propietarios = propietarios;
        this.vacunas = vacunas;
        this.usuarios = usuarios;
        this.reportes = reportes;
        
    }

    public Boolean getUsuarios() {
        return usuarios;
    }

    public void setNombreRole(String NombreRole) {
        this.NombreRole = NombreRole;
    }

    public void setAnimales(Boolean animales) {
        this.animales = animales;
    }

    public void setChequeos(Boolean chequeos) {
        this.chequeos = chequeos;
    }

    public void setGrupos(Boolean grupos) {
        this.grupos = grupos;
    }

    public void setProduccion(Boolean produccion) {
        this.produccion = produccion;
    }

    public void setPropietarios(Boolean propietarios) {
        this.propietarios = propietarios;
    }

    public void setVacunas(Boolean vacunas) {
        this.vacunas = vacunas;
    }

    public void setUsuarios(Boolean usuarios) {
        this.usuarios = usuarios;
    }

    public void setReportes(Boolean reportes) {
        this.reportes = reportes;
    }

    public Boolean getReportes() {
        return reportes;
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
