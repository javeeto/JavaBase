/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasico;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javeeto
 */
public class SimpleThread extends Thread{
    
    static SumArray sumarray= new SumArray();
    int a[];
    int resp;
    //constructor 
    public SimpleThread(String str,int nums[]){
        super(str);
        a=nums;
    }
    //redefinicion del metodo run
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Este es el hilo "+getName()+" i="+i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimpleThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        int sum;
        System.out.println(getName()+ " iniciando.");
        resp=sumarray.sumaArreglo(a);
        System.out.println("Suma para "+getName()+ " es "+resp);
        System.out.println(getName()+ " terminado.");
    }
}
