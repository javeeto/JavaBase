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
public class Pelicula extends ItemInventario{
    private String titulo;
    private int año;
   
    public Pelicula(double a,String b,String c,int d){
        super(a,b);
        titulo=c;
        año=d;
        System.out.println("Ejecuta Pelicula:"+c+","+d);
    }
    public void setPrecio(){
        super.setPrecio(3.50);
    }
    public void setPrecio(double a){
        double nuevoPrecio=a+10;
        super.setPrecio(nuevoPrecio);
    }
    
}
