/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;

import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;


/**
 *
 * @author jefte
 */

public class Produccion {
   private int id;
   private double ordeño_mañana,ordeño_tarde, total;
   private Date fecha;

    public Produccion(int id, double ordeño_mañana, double ordeño_tarde, double total, Date fecha) {
        this.id = id;
        this.ordeño_mañana = ordeño_mañana;
        this.ordeño_tarde = ordeño_tarde;
        this.total = total;
        this.fecha = fecha;
    }
    
    public int getId() {
        return id;
    }

    public double getOrdeño_mañana() {
        return ordeño_mañana;
    }

    public double getOrdeño_tarde() {
        return ordeño_tarde;
    }

    public double getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }
        
    public void setId(int id) {
        this.id = id;
    }

    public void setOrdeño_mañana(double ordeño_mañana) {
        this.ordeño_mañana = ordeño_mañana;
    }

    public void setOrdeño_tarde(double ordeño_tarde) {
        this.ordeño_tarde = ordeño_tarde;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
   
   
   
   
}
