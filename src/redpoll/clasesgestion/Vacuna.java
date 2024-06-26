/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectodos;
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
    protected Date fecha;
    protected Map<Integer,Vacuna> infoVacuna;
    

    public Vacuna(int id, String nombre, Date fecha) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.infoVacuna=new HashMap<>(); 
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
