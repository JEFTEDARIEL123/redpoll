/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.Propietarios;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Villalobos
 */
public class GestionPropietario {
    private Map<String, Propietario> propietarios;

    public GestionPropietario() {
        this.propietarios = new HashMap<>();
        
    }

    public Map<String, Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(Map<String, Propietario> propietarios) {
        this.propietarios = propietarios;
    }
    
     public void agregarPropietario(Propietario propietario) {
        int id = obtenerUltimoId() + 1;
        propietario.setID(id);
        this.propietarios.put(propietario.getNombre(), propietario);
    }

    public Propietario obtenerPropietario(String propietario) {
        
        return this.propietarios.get(propietario);
    }
    public boolean validarExistencia(String propietario){
        return this.propietarios.containsKey(propietario);
    }
    public void actualizarPropietario(Propietario propietario) {
        this.propietarios.put(propietario.getNombre(), propietario);
    }

    public void eliminarPropietario(String propietario) {
        this.propietarios.remove(propietario);
    }

    public int obtenerUltimoId() {
        if (this.propietarios.isEmpty()) {
            return 0; 
        }
        return this.propietarios.values().stream()
                .mapToInt(Propietario::getID)
                .max()
                .orElse(0); 
    }
    
}
