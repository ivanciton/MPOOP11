/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 *
 * @author alumno
 */
public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {//constructor no dejamos que el usuario cambie el mensaje 
        super("saldo insuficiente");
    }
    
}
