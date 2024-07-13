/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.animales;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kristel Gamboa M
 */
public class GestionAnimal {
    private Map<String,Animal>animales;

    public GestionAnimal() {
        this.animales = new HashMap<>();
    }

    public Map<String, Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(Map<String, Animal> animales) {
        this.animales = animales;
    }
    public void agregarAnimal(Animal animal){
        int id=obtenerUltimoId()+1;
        animal.setId(id);
        this.animales.put(String.valueOf(animal.getId()),animal);
        ordenarIds();
        
    }
    
    public Animal obtenerAnimal(String animal) {
        return this.animales.get(animal);
    }
    
    public boolean validarExistencia(String animal){
        return this.animales.containsKey(animal);
    }
    public void actualizarAnimal(Animal animal) {
        this.animales.put(String.valueOf(animal.getId()), animal);
    }

    public void eliminarAnimal(String idAnimal) {
        this.animales.remove(idAnimal);
    }
    
    public int obtenerUltimoId() {
        if (this.animales.isEmpty()) {
            return 0; 
        }
        return this.animales.values().stream()
                .mapToInt(Animal::getId)
                .max()
                .orElse(0); 
    }
    
    public void ordenarIds() {
        int id = 1;
        for (Animal animal : this.animales.values()) {
            animal.setId(id);
            id++;
        }
   }
    
    
}
