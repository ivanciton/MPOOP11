/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     */
                                           //throws MontoMaximoException, NumMaximoDeposito
    public static void main(String[] args)  {
        // TODO code application logic here
        try{
 
            String [] mensajes={"mensaje 1","mensaje 2","mensaje 3"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]); 
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }  
        System.out.println("Sigue el codigo");
        System.out.println("############Division entre cero##########");
        try{
        
            float x=10/0;
            System.out.println("x="+x);
        }catch(ArithmeticException ex){
            System.out.println("error"+ex.getMessage());
        }finally{
            System.out.println("A pesar de todo se ejecuta el finally");
        }
        
        System.out.println("############catch anidados##########");
        try{
        
            float x=10/0;
            System.out.println("x="+x);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Error"+ex.getMessage());
        }finally{
            System.out.println("A pesar de todo se ejecuta el finally");
        }
        
        System.out.println("############Propagacion de excepciones##########");
        try{
            double division=miMetodoDivision(20.0f,0);
            System.out.println(division);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());     
        }
         System.out.println("############Mi cuenta##########");
         Cuenta cuenta=new Cuenta();
         
        try {
            System.out.println("$"+cuenta.getSaldo());
            cuenta.depositar(19000);
            System.out.println("$"+cuenta.getSaldo());
            cuenta.retirar(1000);
            System.out.println("$"+cuenta.getSaldo());
            cuenta.retirar(2000);
            System.out.println("$"+cuenta.getSaldo());
            cuenta.retirar(3000);
            System.out.println("$"+cuenta.getSaldo());
            cuenta.retirar(200);
            System.out.println("$"+cuenta.getSaldo());
       
        }catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getLocalizedMessage());
        }catch (MontoMaximoException ex){
            System.out.println(ex.getLocalizedMessage());
        }catch (NumMaximoDeposito ex){
            System.out.println(ex.getLocalizedMessage());
        }
        System.out.println("saldo final $"+cuenta.getSaldo());
         
    }
    
    /**
     * 
     * @param f variable de tipo float,es el numerador
     * @param d varaiable de tipo float, es el denominador
     * @return un double
     * @throws ArithmeticException lanza una exepcion
     */
    private static double miMetodoDivision(float f, double d) throws ArithmeticException{
        return f/d;
    }

    
    
}
