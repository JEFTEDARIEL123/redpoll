/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.auth;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jefte
 */
public class GestionUsuarios {
    private static GestionUsuarios instanciaGestionUsuarios;
    private Map<String, Usuario> usuarios;
    
    public GestionUsuarios(){
        usuarios = new HashMap<>();
        Usuario adminDefault = new Usuario(obtenerUltimoId()+1, "Admin", "admin@redpoll.com","123", 1);
        Usuario veterinarioDefault = new Usuario(obtenerUltimoId()+1, "Veterinario", "veterinario@redpoll.com","eldoctor", 2);
        Usuario lecheroDefault = new Usuario(obtenerUltimoId()+1, "Lechero", "lechero@redpoll.com","llegolaleche", 3);
        
        this.usuarios.put(adminDefault.getCorreo(), adminDefault);
        this.usuarios.put(veterinarioDefault.getCorreo(), veterinarioDefault);
        this.usuarios.put(lecheroDefault.getCorreo(), lecheroDefault);
    }
    
    public static GestionUsuarios getInstance(){
        if(instanciaGestionUsuarios == null){
            instanciaGestionUsuarios = new GestionUsuarios();
        }
        return instanciaGestionUsuarios;
    }
    
    public void setUsuarioes(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void agregarUsuario(Usuario usuario){
        this.usuarios.put(usuario.getCorreo(), usuario);
    }
    
    public Usuario obtenerUsuario(int id) {    
        return this.usuarios.get(id);
    }
    
    public void editarUsuario(Usuario usuario) {
        this.usuarios.put(usuario.getCorreo(), usuario);
    
    }
    
    public void eliminarUsuario(int id) {
        this.usuarios.remove(id);
    }
    
    public Map<String, Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public boolean validarExistencia(String correo){
        return this.usuarios.containsKey(correo);
    }
    
    public int obtenerUltimoId() {
        if (this.usuarios.isEmpty()) {
            return 0;
        }
        return this.usuarios.values().stream()
                .mapToInt(Usuario::getId)
                .max().getAsInt(); 
    }
}
