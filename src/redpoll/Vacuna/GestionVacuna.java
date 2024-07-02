/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.Vacuna;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Kristel Gamboa M
 */
public class GestionVacuna {
    private Map<String,Vacuna> vacunas;

    public GestionVacuna() {
        this.vacunas = new HashMap<>();
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
        this.vacunas.put(vacuna.getNombre(),vacuna);
        
    }
    
    public Vacuna obtenerVacuna(String vacuna) {
        return this.vacunas.get(vacuna);
    }
    
    public boolean validarExistencia(String vacuna){
        return this.vacunas.containsKey(vacuna);
    }
    public void actualizarVacuna(Vacuna vacuna) {
        this.vacunas.put(vacuna.getNombre(), vacuna);
    }

    public void eliminarVacuna(String vacuna) {
        this.vacunas.remove(vacuna);
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
}
