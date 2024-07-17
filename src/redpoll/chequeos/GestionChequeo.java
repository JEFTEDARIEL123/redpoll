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
    private static GestionChequeo instanciaGestionChequeo;
    private Map<String ,Chequeo> infoChequeo;
    //se inicializa la clase
    public GestionChequeo() {
        this.infoChequeo = new HashMap<>();
        Chequeo chequeo1 = new Chequeo(this.obtenerUltimoId()+1, "10/2/2024","Juan", "Se encuentra bien, falta alimentar un poco mas", 1,1);
        Chequeo chequeo2 = new Chequeo(this.obtenerUltimoId()+1, "11/2/2024","Juan", "Tiene problemas de mastitis", 2,3);
        
        
        this.agregarChequeo(chequeo1);
        this.agregarChequeo(chequeo2);
    }
    //Metodo para obtener/crear una unica instancia
    public static GestionChequeo getInstance(){
        if(instanciaGestionChequeo == null){
            instanciaGestionChequeo = new GestionChequeo();
        } 
        return instanciaGestionChequeo;
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

    }
    
    public Chequeo obtenerChequeo(String chequeo) {
        return this.infoChequeo.get(chequeo);
    }
    
    //Se encarga de validar la existencia del chequeo
    public boolean validarExistencia(String chequeo){
        return this.infoChequeo.containsKey(chequeo);
    }
    //actualiza un chequeo
    public void actualizarChequeo(Chequeo chequeo) {
        this.infoChequeo.put(String.valueOf(chequeo.getId()), chequeo);
    }
    
    //elimina un chequeo
    public void eliminarChequeo(String idChequeo) {
        this.infoChequeo.remove(idChequeo);
    }
    //obtiene el ultimo id del hashmap
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
