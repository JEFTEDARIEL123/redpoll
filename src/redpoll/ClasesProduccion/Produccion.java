/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.ClasesProduccion;

import java.time.LocalDate;
import java.util.HashMap;
import javax.swing.JOptionPane;


/**
 *
 * @author jefte
 */

//Con esta clase se van a crear los diferentes objetos
//Referentes a cada produccion ingresada.
public class Produccion {
   private int id;
   private double ordeño_mañana,ordeño_tarde, total;
   private LocalDate fecha;

    public Produccion(int id, double ordeño_mañana, double ordeño_tarde, double total, LocalDate fecha) {
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

    public LocalDate getFecha() {
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

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
   
   
   
   
}
