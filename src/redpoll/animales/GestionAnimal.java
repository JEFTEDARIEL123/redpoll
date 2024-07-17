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
    private static GestionAnimal instanciaGestionAnimal;
    private Map<String,Animal>animales;

    public GestionAnimal() {
        this.animales = new HashMap<>();
        Animal animal1 = new Animal(this.obtenerUltimoId()+1,"Angus","12/5/2020",1,1);
        Animal animal2 = new Animal(this.obtenerUltimoId()+1,"Angus","2/3/2022",1,1);
        Animal animal3 = new Animal(this.obtenerUltimoId()+1,"Holstein","6/8/2019",2,2);
        Animal animal4 = new Animal(this.obtenerUltimoId()+1,"Holstein","22/9/2021",2,3);
        
        this.agregarAnimal(animal1);
        this.agregarAnimal(animal2);
        this.agregarAnimal(animal3);
        this.agregarAnimal(animal4);
    }
    
    //Metodo estatico para crear una instancia de esta clase
    public static GestionAnimal getInstance(){
        if(instanciaGestionAnimal == null){
            instanciaGestionAnimal = new GestionAnimal();
        }
        return instanciaGestionAnimal;
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


    
    
}
