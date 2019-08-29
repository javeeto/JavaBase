/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author javeeto
 */
public class Archivo {
    
    public void LeeEscribeArchivo() {
        String salida="";
        try{
            FileWriter fw=new FileWriter("/tmp/corre.txt");
            fw.write("Prueba linea uno\n");
            fw.write("Prueba linea dos\n");
            fw.close();
            
            FileReader fr=new FileReader("/tmp/corre.txt");
            BufferedReader br=new BufferedReader(fr);
            while((salida=br.readLine())!=null){
                System.out.println(salida);
            }
            fr.close();
            
        }catch(FileNotFoundException fnfex){
            System.out.println("Error Archivo no encontrado:"+fnfex);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
