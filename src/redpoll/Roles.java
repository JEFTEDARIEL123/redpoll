/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Roles {
    
    private HashMap<Integer, String> roles;
    private HashMap<Integer, Permisos> permi;

    public HashMap<Integer, String> getRoles() {
        return roles;
    }

    public void setRoles(HashMap<Integer, String> roles) {
        this.roles = roles;
    }

    public HashMap<Integer, Permisos> getPermi() {
        return permi;
    }

    public void setPermi(HashMap<Integer, Permisos> permi) {
        this.permi = permi;
    }
    
    

    public Roles() {
        roles = new HashMap<>();
        permi = new HashMap<>();
        
       
        
   
    }
    
    public String obtenerRol(int rolId) {
        return roles.get(rolId);
    }
    
     public Permisos obtenerPermisos(int rolId) {
        return permi.get(rolId);
    }
    //Regresa el rol
    
    
    public void  agregarRoles(){
        //Asignar Roles
        roles.put(1,"Adminmistrador");
        roles.put(2,"Veterinario");
        roles.put(3,"Encargado de la Lecheria");
        // Administrador
            //key
    permi.put(1,new Permisos(Arrays.asList(true,true,true,true,true))); 
    //Veterinario
                 //key
        permi.put(2, new Permisos(Arrays.asList(true,false,true,false,true)));
        // Lecheria(Produccion)                //1
                 //key
        permi.put(3,new Permisos(Arrays.asList(false,false,true,false,true))); 
    }
     
     
    public void validarRol(){
        
        /*
        Roles roles = new Roles();
        roles.agregarRoles();
        
        
        Permisos permisosRoles = roles.obtenerPermisos(usuario.getIdRol());
        
        if (permisosRoles != null) {
                System.out.println("");
                System.out.println("Permisos....");
                System.out.println("");
                roles.mostrarPermisos(permisosRoles);
            } else {
                System.out.println("error");
            }
            
            
        } else {
           
        }*/
    
    
    
    }
    //Borrar
    public void mostrarLaLogicaTerminal(){
         //PRUEBAS
        
      
      //instncias
        Roles roles = new Roles();
        roles.agregarRoles();
        
        //datosprecargados
        Usuario usu1 = new Usuario(1,1,"carlos pendez",  "carlosmen@gmail.com", "password12345");
        Usuario usu2 = new Usuario(2,2,"maria puzan", "marisuzan@gmai.com", "password56789");
        Usuario usu3 = new Usuario(3,3,"juan perez","juanperez@gmail.com", "passwordabcde");
        Usuario usu4 = new Usuario(3,2,"ana Jimenez","anajimenez@gmail.com", "passwordfghij");
        Usuario usu5 = new Usuario(3,3,"El pepe Martinez","pepe@gmail.com", "passwordklmno");
        mostrarInformacionUsuario(usu1,roles);
        mostrarInformacionUsuario(usu2,roles);
        mostrarInformacionUsuario(usu3,roles);
        mostrarInformacionUsuario(usu4,roles);
        mostrarInformacionUsuario(usu5,roles);
    }
 
   public static void mostrarInformacionUsuario(Usuario usuario, Roles roles) {
    
        String rolIngre = roles.obtenerRol(usuario.getIdRol());

        
        if (rolIngre != null) {
            System.out.println("Nombre " + usuario.getNombre() + "Su Rol " + rolIngre);
 
            Permisos permisosRoles = roles.obtenerPermisos(usuario.getIdRol());

            if (permisosRoles != null) {
                System.out.println("");
                System.out.println("Permisos....");
                System.out.println("");
                roles.mostrarPermisos(permisosRoles);
            } else {
                System.out.println("error");
            }
            
            
        } else {
            System.out.println("No hay permisos " + usuario.getNombre());
        }

    
    
    }
    
    
    
    
    
    public  void mostrarPermisos(Permisos permisos) {
       //for each tip,obj + GET
    for (boolean esTrueOrFalse : permisos.getPermiso()) {
        if (esTrueOrFalse) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    
   }
    
   
    
    
     
    

   
    }

   

