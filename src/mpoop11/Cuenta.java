/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private float saldo;
    private int maxDepositos=1;

    public Cuenta() {
    }
    /**
     * 
     * @return regrsa el valor de la variable saldo
     */

    public float getSaldo() {
        return saldo;
    }
    /**
     * 
     * @param monto cantidad que se desea depositar
     * @throws MontoMaximoException lanza una exepcion de MontoMaximoException
     * no retorna ningun valor
     */
    public void depositar(float monto) throws MontoMaximoException{
        System.out.println("Depositando.....$"+monto);
        if(monto>20_000){
            throw new MontoMaximoException();
        }else{
            saldo+=monto;
        }
    }
    
    /**
     * 
     * @param monto cantidad que se desea retirar
     * @throws SaldoInsuficienteException lanza una excepcion de SaldoInsuficienteException
     * @throws NumMaximoDeposito lanza una excepcion de NumMaximoDeposito
     * no retorna ningun valor
     */
    public void retirar(float monto)throws SaldoInsuficienteException, NumMaximoDeposito{//va  lanzar una exepcion
        System.out.println("Retirando.....$"+monto);
        if(saldo<monto){
            throw new SaldoInsuficienteException();
        }else if(maxDepositos>3){
            throw new NumMaximoDeposito();
        }else{
            saldo-=monto;     
        }
        maxDepositos++;
    }
}
