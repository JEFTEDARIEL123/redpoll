/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author jefte
 */
public class GestionProduccion {
    
    private Map<Integer, Produccion> producciones;
    
    public void GestionProduccion(){
        this.producciones = new HashMap<>();
    }
    
    public void setProducciones(Map<Integer, Produccion> producciones) {
        this.producciones = producciones;
    }

    public int generarId(){
        return (((Map.Entry<Integer, String>)this.producciones.entrySet().toArray()[producciones.size()-1]).getKey())+1;
    }
    
    public void agregarProduccion(Produccion produccion){
        this.producciones.put(generarId(), produccion);
    }
    
    public void editarProduccion(int id, int seleccionEdit, double datoNuevo){
        // El 1 equivale al dato de Ordeño_mañana, mientras que el 2 a la tarde
        Produccion produccion = this.producciones.get(id);
        
        if(datoNuevo >= 0){
            switch(seleccionEdit){
                case 1:
                    produccion.setOrdeño_mañana(datoNuevo);
                    JOptionPane.showMessageDialog(null, "Los datos se han actualizado exitosamente.", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    produccion.setOrdeño_tarde(datoNuevo);
                    JOptionPane.showMessageDialog(null, "Los datos se han actualizado exitosamente.", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error!, el campo a modificar no es válido", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        
        if (!(datoNuevo >= 0)){
            JOptionPane.showMessageDialog(null, "Debe ingresar un dato mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarProduccion(int id){
        if(this.producciones.remove(id) == null){
            JOptionPane.showMessageDialog(null, "Error! El campo a modificar no es válido o no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            this.producciones.remove(id);
        }
    }
    
    public Map<Integer, Produccion> getProducciones() {
        return producciones;
    }
}
