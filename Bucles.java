/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

/**
 *
 * @author javeeto
 */
public class Bucles {
    
    Bucles(){
        int i=0;
        while(i<10){
            System.out.println("i="+i);
            i++;
        }
    
    }
    
    public void doWhile(){
        int i=0;
        do{
            System.out.println("i="+i);
            i++;
        }while(i<10);
    }
    
    public void errorWhile(){
        int x=10;
        while(x>0){
            System.out.println(x--);
            
        }
         System.out.println("Fin!");
    }
    
    
}
