/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.vacunas;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Kristel Gamboa M
 */
public class GestionVacuna {
    private static GestionVacuna instanciaGestionVacuna;
    private Map<String,Vacuna> vacunas;

    public GestionVacuna() {
        this.vacunas = new HashMap<>();
    }
    
    public static GestionVacuna getInstance(){
        if(instanciaGestionVacuna == null){
            instanciaGestionVacuna = new GestionVacuna();
        }
        return instanciaGestionVacuna;
    }

    public Map<String, Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(Map<String, Vacuna> vacunas) {
        this.vacunas = vacunas;
    }
    
    public void agregarVacuna(Vacuna vacuna){
        int id=obtenerUltimoId()+1;
        vacuna.setId(id);
        this.vacunas.put(String.valueOf(vacuna.getId()),vacuna);
        ordenarIds();
   
    }
    
    public Vacuna obtenerVacuna(String vacuna) {
        return this.vacunas.get(vacuna);
    }
    
    public boolean validarExistencia(String vacuna){
        return this.vacunas.containsKey(vacuna);
    }
    public void actualizarVacuna(Vacuna vacuna) {
        this.vacunas.put(String.valueOf(vacuna.getId()), vacuna);
    }

    public void eliminarVacuna(String idVacuna) {
        this.vacunas.remove(idVacuna);
    }
    
    public int obtenerUltimoId() {
        if (this.vacunas.isEmpty()) {
            return 0; 
        }
        return this.vacunas.values().stream()
                .mapToInt(Vacuna::getId)
                .max()
                .orElse(0); 
    }
    
    public void ordenarIds() {
        int id = 1;
        for (Vacuna vacuna : this.vacunas.values()) {
            vacuna.setId(id);
            id++;
        }
   }
    
}
