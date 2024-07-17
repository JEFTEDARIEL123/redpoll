/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.roles;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class GestionRoles {
    private static GestionRoles instanciaGestionRoles;
    private HashMap<Integer, Role> ListaRoles = new HashMap<>();
   
    public GestionRoles() {
        // Orden permisos:
        // Animales, chequeos, grupos, produccion, propietarios, vacunas, usuarios, reportes
        Role admin = new Role(1,"Admin", true, true, true, true, true, true, true, true);
        Role veterinario = new Role(2,"Veterinario", true, true, false, false, false, true, false , false);
        Role lechero = new Role(3,"Lechero", false, false, false, true, false, false,false , false);
        
        ListaRoles.put(1, admin);
        ListaRoles.put(2, veterinario);
        ListaRoles.put(3, lechero);
        this.ListaRoles = ListaRoles;
    }
    
    public static GestionRoles getInstance(){
        if(instanciaGestionRoles == null){
            instanciaGestionRoles = new GestionRoles();
        }
        return instanciaGestionRoles;
        
    }
    
    public int obtenerUltimoId(){
        if(this.ListaRoles.isEmpty()){
            return 0;
        } 
        return this.ListaRoles.values().stream().mapToInt(Role::getId).max().getAsInt();
    }
    
    public void agregarRole(Role role){
        this.ListaRoles.put(obtenerUltimoId()+1, role);
    }
    
    public Role mostrarRole(int id){
        return this.ListaRoles.get(id);
    }
    
  }

   

