/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;
import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class GestionRoles {
    private HashMap<Integer, Role> ListaRoles;
   
    public GestionRoles() {
        Role role1 = new Role(1,"Admin", true);
        ListaRoles.put(1, role1);
        this.ListaRoles = ListaRoles;
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
    
  }

   

