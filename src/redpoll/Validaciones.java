/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll;

import javax.swing.JOptionPane;

/**
 *
 * @author jefte
 */
public class Validaciones {
    public static boolean validar(String dato,String err, String regex){
        if(dato.matches(regex)){
            return true;
        } else {
            menuErr(err);
            return false;
        }
    }
    
    public static void menuErr(String err){
        JOptionPane.showMessageDialog(null, err);
    }
}
