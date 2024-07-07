/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Extremetech SC
 */
public class GestorGrupo {
    
    private Map<String, Grupo> grupos;

    public GestorGrupo() {
        grupos = new HashMap<>();
    }

    public Map<String, Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Map<String, Grupo> grupos) {
        this.grupos = grupos;
    }
    //Metodos
    
    public void agregarGrupo(Grupo grupo) {
    int idGrupo = obtenerUltimoId() + 1;
    
    grupo.setIdGrupo(idGrupo);
    
    this.grupos.put(grupo.getTipo(), grupo);
}

    
    public void actualirGrupo(Grupo grupos) {
        this.grupos.put(grupos.getTipo(), grupos);
    }
    
    public boolean validarExistencia(String tipo){
        return this.grupos.containsKey(tipo);
    }
     public void actualizarGrupo(Grupo grupos) {
        this.grupos.put(grupos.getTipo(), grupos);
    }
     
     public void eliminarGrupo(String tipo) {
        this.grupos.remove(tipo);
    }
     
      public Grupo obtenerGrupo(Grupo grupos) {
        this.grupos.put(grupos.getTipo(), grupos);
        return null;
    }
     
     public int obtenerUltimoId() {
        if (this.grupos.isEmpty()) {
            return 0; 
        }
        return this.grupos.values().stream()
                .mapToInt(Grupo::getIdGrupo)
                .max()
                .orElse(0); 
    }

    void actualizarGrupo(String gP) {
        
    }
    
    
    
}
