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
public class ItemInventario {
    private double precio;
    private String referencia;
    public ItemInventario(double a, String b){
        precio = a;
        referencia=b;
        System.out.println("Ejecuta ItemInventario:"+a+","+b);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
}
