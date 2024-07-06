/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redpoll;

import java.util.Arrays;

/**
 *
 * @author jefte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      
        
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
}
      
       
        

     
    
    
    
 

