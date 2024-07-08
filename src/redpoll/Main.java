/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redpoll;
import redpoll.login.InterfazLogin;
import redpoll.Propietarios.GitPropietario;

/**
 *
 * @author jefte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(() -> {
        new InterfazLogin().setVisible(true);
    });
}
    
//    public static void main(String[] args) {
//        GitPropietario propietario = new GitPropietario();
//        propietario.setVisible(true);
//        propietario.setResizable(false);
//        propietario.setLocationRelativeTo(null);
//        
//    }
    
}
