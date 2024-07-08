/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redpoll.ManejoArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Luis Villalobos
 */
public class MantenimientoArchivos {
    String PathUsuarios = "C://Users//Luis Villalobos//Desktop//redpoll//src//Usuario.txt";
    private File file;
    FileReader fr = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    FileWriter fwrite;
    Scanner dataReader;
    

    public MantenimientoArchivos() {
    file = new File(PathUsuarios);
    }
    

    public void GuardarArchivo(String Correo, String Contraseña){
        try{
            if(!file.exists()){
                file.createNewFile();
                
            }
            else {
                fwrite = new FileWriter(PathUsuarios);
                fwrite.write(Correo + "," + Contraseña);
                fwrite.close();
                System.out.println("Guardado exitoso");
            }
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
            
    }
    
    public Boolean validarCorreoContraseña(String Correo, String Contraseña){
        String fileData = "";
        String format = Correo + "," + Contraseña;
        boolean status = false;
        try{
        if(file.exists()){
        dataReader = new Scanner(file); 
                do{                   
                    if(dataReader.hasNextLine()){

                    fileData = dataReader.nextLine(); 
                        if(fileData.equals(format)){
                            status = true;
                        }
                    }
                }while (!fileData.equals(format));

                System.out.println(fileData);

            

            dataReader.close();
        }
    
    }catch(IOException e){
        status = false;
        
    }
        return status;
    }
    
}

