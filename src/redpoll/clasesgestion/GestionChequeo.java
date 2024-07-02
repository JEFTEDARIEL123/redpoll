/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.clasesgestion;
import java.util.Map;
import java.util.HashMap;


/**
 *
 * @author Kristel Gamboa M
 */
public class GestionChequeo {
    protected Map<Integer,Chequeo> infoChequeo;

    public GestionChequeo() {
        this.infoChequeo = new HashMap<>();
    }

    public Map<Integer,Chequeo> getInfoChequeo() {
        return infoChequeo;
    }

    public void setInfoChequeo(Map<Integer,Chequeo> infoChequeo) {
        this.infoChequeo = infoChequeo;
    }

    public void agregarChequeo(Chequeo chequeo) {
        int id = obtenerUltimoId() + 1;
        chequeo.setId(id);
        this.infoChequeo.put(chequeo.getId(), chequeo);
    }
    
     public Chequeo obtenerChequeo(int id) {
        return this.infoChequeo.get(id);
    }
    public boolean validarExistencia(int id){
        return this.infoChequeo.containsKey(id);
    }
    public void actualizarChequeo(Chequeo chequeo) {
        this.infoChequeo.put(chequeo.getId(), chequeo);
    }

    public void eliminarChequeo(int id) {
        this.infoChequeo.remove(id);
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
}
