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
    //COn este metodo estatico se van a realizar la myoria de validaciones
    public static boolean validar(String dato,String err, String regex){
        if(dato.matches(regex)){
            return true;
        } else {
            //Si el dato no es valido se llama a este otro metodo pa mostrar un msg de error
            menuErr(err);
            return false;
        }
    }
    
    public static String validarStr(String dato,String err, String regex){
        if(dato.matches(regex)){
            return dato;
        } else {
            //Si el dato no es valido se llama a este otro metodo pa mostrar un msg de error
            menuErr(err);
            return "";
        }
    }
    
    public static void menuErr(String err){
        JOptionPane.showMessageDialog(null, err);
    }
}
