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
    private static int TokenRoleActual;

    public GestionUsuarios() {
        usuarios = new HashMap<>();
        
        //se inicializan algunos usuarios pre cargados
        Usuario adminDefault = new Usuario(obtenerUltimoId() + 1, "Admin", "admin@redpoll.com", "123", 1);
        Usuario veterinarioDefault = new Usuario(obtenerUltimoId() + 1, "Veterinario", "veterinario@redpoll.com", "eldoctor", 2);
        Usuario lecheroDefault = new Usuario(obtenerUltimoId() + 1, "Lechero", "lechero@redpoll.com", "llegolaleche", 3);
        
        this.agregarUsuario(adminDefault);
        this.agregarUsuario(veterinarioDefault);
        this.agregarUsuario(lecheroDefault);
    }
    
    //Se obtiene una instancia de esta clase
    public static GestionUsuarios getInstance() {
        if (instanciaGestionUsuarios == null) {
            instanciaGestionUsuarios = new GestionUsuarios();

        }
        return instanciaGestionUsuarios;
    }

    
    //Se setea un token de autenticacion, este token se maneja con la id del role
    public static void setTokenRoleActual(int token) {

        TokenRoleActual = token;

    }
    
    
    //Lo mismo pero para obtener el token
    public static int getTokenRoleActual() {

        return TokenRoleActual;
    }

    //Y otro  monton de getters y setters
    public void setUsuarioes(Map<String, Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuarios.put(usuario.getCorreo(), usuario);
    }

    public Usuario obtenerUsuario(String correo) {
        return this.usuarios.get(correo);
    }

    public void editarUsuario(Usuario usuario) {
        this.usuarios.put(usuario.getCorreo(), usuario);

    }

    public void eliminarUsuario(String correo) {
        this.usuarios.remove(correo);
    }

    public Map<String, Usuario> getUsuarios() {
        return this.usuarios;
    }

    public boolean validarExistencia(String correo) {
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
