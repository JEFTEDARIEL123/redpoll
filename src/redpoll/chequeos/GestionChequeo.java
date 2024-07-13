/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.chequeos;
import java.util.Map;
import java.util.HashMap;



/**
 *
 * @author Kristel Gamboa M
 */
public class GestionChequeo {
    protected Map<String ,Chequeo> infoChequeo;

    public GestionChequeo() {
        this.infoChequeo = new HashMap<>();
    }

    public Map<String,Chequeo> getInfoChequeo() {
        return infoChequeo;
    }

    public void setInfoChequeo(Map<String,Chequeo> infoChequeo) {
        this.infoChequeo = infoChequeo;
    }

    public void agregarChequeo(Chequeo chequeo) {
        int id = obtenerUltimoId() + 1;
        chequeo.setId(id);
        this.infoChequeo.put(String.valueOf(chequeo.getId()), chequeo);
        ordenarIds();
    }
    
    public Chequeo obtenerChequeo(String chequeo) {
        return this.infoChequeo.get(chequeo);
    }
    public boolean validarExistencia(String chequeo){
        return this.infoChequeo.containsKey(chequeo);
    }
    public void actualizarChequeo(Chequeo chequeo) {
        this.infoChequeo.put(String.valueOf(chequeo.getId()), chequeo);
    }
    public void eliminarChequeo(String idChequeo) {
        this.infoChequeo.remove(idChequeo);
    }

    private int obtenerUltimoId() {
        if (this.infoChequeo.isEmpty()) {
            return 0; 
        }
        return this.infoChequeo.values().stream()
                .mapToInt(Chequeo::getId)
                .max()
                .orElse(0); 
    }
    
    public void ordenarIds() {
        int id = 1;
        for (Chequeo chequeo : this.infoChequeo.values()) {
            chequeo.setId(id);
            id++;
        }
   }
}
