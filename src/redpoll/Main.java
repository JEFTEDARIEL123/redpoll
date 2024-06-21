/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redpoll;
import java.util.Date;
/**
 *
 * @author jefte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha = new Date(20,2,2003);
        Produccion uno = new Produccion(1,0,0,0,fecha);
        
        uno.editarProduccion(5, 799);
        System.out.println(uno.getOrdeño_tarde());
    }
    
}
