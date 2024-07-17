/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.vacunas;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author PC-Familiar
 */
public class Vacuna {
    protected int id;
    protected String nombre;
    protected String fecha;
    

    public Vacuna(int id, String nombre,String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "id=" + id + ", nombre=" + nombre + ", fecha=" + fecha + '}';
    }
    
}
