/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodos;


/**
 *
 * @author PC-Familiar
 */
public class Chequeo {
    protected int id;
    protected String nombreVeterinario;
    protected String observaciones;
    

    public Chequeo(int id,String nombreVeterinario, String observaciones) {
        this.id = id;

        this.nombreVeterinario = nombreVeterinario;
        this.observaciones = observaciones;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Chequeo{" + "id=" + id + ", nombreVeterinario=" + nombreVeterinario + ", observaciones=" + observaciones + '}';
    } 
}
