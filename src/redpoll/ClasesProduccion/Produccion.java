/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.ClasesProduccion;

import java.time.LocalDate;


/**
 *
 * @author jefte
 */

//Con esta clase se van a crear los diferentes objetos
//Referentes a cada produccion ingresada.
public class Produccion {
   int id;
   double ordeñoMañana,ordeñoTarde, total;
   LocalDate fecha;

    public Produccion(int id, double ordeñoMañana, double ordeñoTarde) {
        this.id = id;
        this.ordeñoMañana = ordeñoMañana;
        this.ordeñoTarde = ordeñoTarde;
        this.total = this.ordeñoMañana+this.ordeñoTarde;
        this.fecha = LocalDate.now();
    }

    public int getId() {
        return id;
    }


    public double getOrdeñoMañana() {
        return ordeñoMañana;
    }

    public double getOrdeñoTarde() {
        return ordeñoTarde;
    }

    public double getTotal() {
        return total;
    }

    public LocalDate getFecha() {
        return fecha;
    }
        

    public void setOrdeño_mañana(double ordeñoMañana) {
        this.ordeñoMañana = ordeñoMañana;
    }

    public void setOrdeño_tarde(double ordeñoTarde) {
        this.ordeñoTarde = ordeñoTarde;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
   
   
   
   
}
