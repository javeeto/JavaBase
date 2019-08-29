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
public class JavaBasico {

    JavaBasico() {
        boolean b = false;
        if (b == false) {
            System.out.println("Valor de b:" + b);

        } else {
            System.out.println("Valor2 de b:" + b);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        JavaBasico miIf = new JavaBasico();
        Bucles miBucle = new Bucles();
        Pelicula peli = new Pelicula(30.23, "Peli 1", "Cap Marvel", 1914);
        SubClase hijaSub = new SubClase();
        Excepcion miExcep = new Excepcion();
        Arreglo arregloObj=new Arreglo();
        int a[]={1,2,3,4,5};
        SimpleThread miHilo=new SimpleThread("Hilo 1",a);
        SimpleThread miHilo2=new SimpleThread("Hilo 2",a);
        Archivo arch = new Archivo();
        //miBucle.doWhile();
        //miBucle.errorWhile();
        peli.setPrecio();
        System.out.println("Precio peli1:" + peli.getPrecio());
        peli.setPrecio(5);
        System.out.println("Precio peli2:" + peli.getPrecio());
        hijaSub.miMetodo();
        hijaSub.unMetodo();
        hijaSub.otroMetodo();

        try {
            miExcep.tryAnidado(args);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Se necesitan 2 parametros");
        }
        miExcep.PruebaRechazarString();
        try {
            miExcep.lanzamiento();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        arregloObj.arregloObjeto();
        miHilo.start();
        miHilo2.start();
        arch.LeeEscribeArchivo();
         

    }

}
