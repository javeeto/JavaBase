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
public class Excepcion {

    public Excepcion() {
        try {
            int den = 0;
            System.out.println(3 / den);
        } catch (ArithmeticException exc) {
            System.out.println("Divisor es cero");
        } catch (ArrayIndexOutOfBoundsException exc2) {
            System.out.println("Esperando argumento");
        }
    }

    public void tryAnidado(String args[]) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArithmeticException exc) {
            System.out.println("Error: Divisor es cero");
        }
    }
    
    public void PruebaRechazarString(){
        String entrada="Entrada Invalida";
        try{
            if(entrada.equals("Entrada Invalida")){
                throw new RechazarStringEntrada();
            }
            System.out.println("String aceptado");
        }catch(RechazarStringEntrada e){
            System.out.println("String rechazado");
        }
    }
    
    public void lanzamiento() throws ClassNotFoundException{
        throw new ClassNotFoundException("Error: ejemplo lanzamiento throw");
    }
}
