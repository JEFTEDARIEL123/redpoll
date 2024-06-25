/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.ClasesProduccion;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author jefte
 */
public class GestionProduccion {
    
    private Map<Integer, Produccion> producciones;
    
    public GestionProduccion(){
        producciones = new HashMap<>();
    }
    
    public void setProducciones(Map<Integer, Produccion> producciones) {
        this.producciones = producciones;
    }
    
    public void agregarProduccion(Produccion produccion){
        this.producciones.put((obtenerUltimoId()+1), produccion);
    }
    
    public Produccion obtenerProduccion(int id) {    
        return this.producciones.get(id);
    }
    
    public void editarProduccion(Produccion produccion) {
        this.producciones.put(produccion.getId(), produccion);
    }
    
    public void eliminarTarea(int id) {
        this.producciones.remove(id);
    }
    
    public Map<Integer, Produccion> getProducciones() {
        return producciones;
    }
    
    public boolean validarExistencia(int id){
        return this.producciones.containsKey(id);
    }
    
    public int obtenerUltimoId() {
        if (this.producciones.isEmpty()) {
            return 0;
        } 
        System.out.println("aa");
        return this.producciones.values().stream()
                .mapToInt(Produccion::getId)
                .max().getAsInt(); 
    }
}
