/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redpoll;

import redpoll.auth.GUIMenuPrincipal;
import redpoll.auth.InterfazLogin;

/**
 *
 * @author jefte
 */
public class Main {

  /**
   * @param args the command line arguments
   */

  public static void main(String[] args) {
    //Inicializamos la gui de login
    InterfazLogin gui = new InterfazLogin();
    gui.setVisible(true);
    gui.setResizable(false);
    gui.setLocationRelativeTo(null);

  }

}
