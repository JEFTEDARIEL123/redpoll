/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redpoll;

import redpoll.clasesgestion.JFChequeo;
import redpoll.Vacuna.JFVacuna;


/**
 *
 * @author jefte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //JFVacuna vacuna = new JFVacuna();
       //vacuna.setVisible(true);
       //vacuna.setResizable(false);
       //vacuna.setLocationRelativeTo(null);
       
       JFChequeo chequeo=new JFChequeo();
       chequeo.setVisible(true);
       chequeo.setResizable(false);
       chequeo.setLocationRelativeTo(null);
    }
    
}
