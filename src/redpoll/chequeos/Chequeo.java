/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.chequeos;

/**
 *
 * @author PC-Familiar
 */
public class Chequeo {
    private int id;
    private String fecha;
    private String nombreVeterinario;
    private String observaciones;
    private int idAnimal, idVacuna;

    
    //Clase base para chequeo

    public Chequeo(int id,String fecha,String nombreVeterinario,String observaciones,int idAnimal,int idVacuna) {
        this.id = id;
        this.fecha=fecha;
        this.nombreVeterinario = nombreVeterinario;
        this.observaciones = observaciones;
        this.idAnimal=idAnimal;
        this.idVacuna = idVacuna;
    }
    
    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public int getIdVacuna() {
        return idVacuna;
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

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    @Override
    public String toString() {
        return "Chequeo{" + "id=" + id + ", fecha=" + fecha + ", nombreVeterinario=" + nombreVeterinario + ", observaciones=" + observaciones + ", idAnimal=" + idAnimal + '}';
    }

    
    
}
