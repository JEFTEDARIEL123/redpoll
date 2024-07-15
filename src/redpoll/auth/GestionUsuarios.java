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
    private Map<Integer, Usuario> usuarios;
    
    public GestionUsuarios(){
        usuarios = new HashMap<>();
    }
    
    public static GestionUsuarios getInstance(){
        if(instanciaGestionUsuarios == null){
            instanciaGestionUsuarios = new GestionUsuarios();
        }
        return instanciaGestionUsuarios;
    }
    
    public void setUsuarioes(Map<Integer, Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void agregarUsuario(Usuario usuario){
        this.usuarios.put(this.obtenerUltimoId()+1, usuario);
    }
    
    public Usuario obtenerUsuario(int id) {    
        return this.usuarios.get(id);
    }
    
    public void editarUsuario(Usuario usuario) {
        this.usuarios.put(usuario.getId(), usuario);
    
    }
    
    public void eliminarUsuario(int id) {
        this.usuarios.remove(id);
    }
    
    public Map<Integer, Usuario> getUsuarioes() {
        return usuarios;
    }
    
    public boolean validarExistencia(int id){
        return this.usuarios.containsKey(id);
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
