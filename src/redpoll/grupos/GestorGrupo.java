/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.grupos;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Extremetech SC
 */
public class GestorGrupo {
    private static GestorGrupo instanciaGestorGrupo;
    private Map<Integer, Grupo> grupos;

    public GestorGrupo() {
        grupos = new HashMap<>();
        //Pre cargamos datos en el hashmap
        Grupo vacasBlancas = new Grupo(this.obtenerUltimoId()+1, "Vaca Blanca", "Vacas de color blanco");
        Grupo vacasPardas = new Grupo(this.obtenerUltimoId()+1, "Vaca Parda", "Vacas de color pardo");
        Grupo vacasNegras = new Grupo(this.obtenerUltimoId()+1, "Vaca Negra", "Vacas de color negro");
        
        this.agregarGrupo(vacasBlancas);
        this.agregarGrupo(vacasPardas);
        this.agregarGrupo(vacasNegras);
       
    }
    //devuelve una instancia de la clase o la crea si no existe
    public static GestorGrupo getInstance(){
        if(instanciaGestorGrupo == null){
            instanciaGestorGrupo = new GestorGrupo();
        }
        return instanciaGestorGrupo;
    }
    
    public void setGrupos(Map<Integer, Grupo> grupos) {
        this.grupos = grupos;
    }
    
    public void agregarGrupo(Grupo grupo){
        int id=obtenerUltimoId()+1;
        grupo.setIdGrupo(id);
        //this.grupos.put(GestorGrupo.getInstance().obtenerUltimoId()+1, grupo);
        this.grupos.put(grupo.getIdGrupo(),grupo);
    }
    
    public Grupo obtenerGrupo(int id) {    
        return this.grupos.get(id);
    }
    
    public void editarGrupo(Grupo grupo) {
        System.out.println(String.valueOf(grupo.getIdGrupo())+" "+ grupo.toString()); 
        this.grupos.put(grupo.getIdGrupo(), grupo);
    
    }
    
    public void eliminarGrupo(int id) {
        this.grupos.remove(id);
    }
    
    public Map<Integer, Grupo> getGrupos() {
        return grupos;
    }
    
    public boolean validarExistencia(int id){
        return this.grupos.containsKey(id);
    }
    
    public int obtenerUltimoId() {
        if (this.grupos.isEmpty()) {
            return 0;
        }
        return this.grupos.values().stream()
                .mapToInt(Grupo::getIdGrupo)
                .max().getAsInt(); 
    }  
}
