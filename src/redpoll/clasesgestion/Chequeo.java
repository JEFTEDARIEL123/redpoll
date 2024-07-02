/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.clasesgestion;

import java.util.Date;


/**
 *
 * @author PC-Familiar
 */
public class Chequeo {
    protected int id;
    private String fecha;
    protected String nombreVeterinario;
    protected String observaciones;
    

    public Chequeo(int id,String fecha,String nombreVeterinario,String observaciones) {
        this.id = id;
        this.fecha=fecha;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Chequeo{" + "id=" + id + ", fecha=" + fecha + ", nombreVeterinario=" + nombreVeterinario + ", observaciones=" + observaciones + '}';
    }
    
}
