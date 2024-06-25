/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Extremetech SC
 */
public class GestorUsuario {
    
     private Map<String, Usuario> usu;
    
    
    
    
    
    public Map<String, Usuario> getUsuario() {
        return usu;
    }
    
    public Map<String, Usuario> setUsuario() {
        return usu;
    }
    
    
    
    //
    public void agregarUsuario(Usuario usu) {
        this.usu.put(usu.getNombre(), usu);
    }
    
}
