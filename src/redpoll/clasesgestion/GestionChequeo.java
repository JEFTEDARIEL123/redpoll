/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodos;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Kristel Gamboa M
 */
public class GestionChequeo {
    protected Date fecha=new Date();
    protected Map<Integer,Chequeo> infoChequeo;

    public GestionChequeo() {
        this.infoChequeo = new HashMap<>();
    }

    public Map<Integer,Chequeo> getInfoChequeo() {
        return infoChequeo;
    }

    public void setInfoChequeo(Map<Integer,Chequeo> infoChequeo) {
        this.infoChequeo = infoChequeo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    public void agregarChequeo(Chequeo chequeo) {
        int id = obtenerUltimoId() + 1;
        chequeo.setId(id);
        
        if(infoChequeo.containsKey(chequeo.getId())){
            JOptionPane.showMessageDialog(null, "La tarea ya existe");
        }else{
            this.infoChequeo.put(chequeo.getId(), chequeo);
        } 
    }
    
     public Chequeo obtenerChequeo(int id) {
        
        return this.infoChequeo.get(id);
    }
    public boolean validarExistencia(int id){
        return this.infoChequeo.containsKey(id);
    }
    public void actualizarChequeo(Chequeo chequeo) {
        this.infoChequeo.put(chequeo.getId(), chequeo);
    }

    public void eliminarChequeo(int id) {
        this.infoChequeo.remove(id);
    }

    private int obtenerUltimoId() {
        if (this.infoChequeo.isEmpty()) {
            return 0; 
        }
        return this.infoChequeo.values().stream()
                .mapToInt(Chequeo::getId)
                .max()
                .orElse(0); 
    }
}
