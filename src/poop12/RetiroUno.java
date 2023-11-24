/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *La clase RetiroUno extiende la clase Thread y representa un hilo
 * que realiza operaciones de depósito o retiro en una cuenta bancaria.
 * @author brismar
 */
public class RetiroUno extends Thread{
    /**
     * Atributos saldo compartido con valor cero 
     */
    private static long saldo = 0;
    /**
     * Construye un nuevo objeto RetiroUno con el nombre especificado.
     * @param nombre El nombre que se asignará al hilo.
     */
    public RetiroUno( String nombre){
        super(nombre);
    }
    /**
     * Método run -  se ejecuta cuando el hilo es iniciado.
     */
    public void run(){
        if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
            this.depositarDinero(100);
        } else{
            this.extraerDinero(50);
        }
    }
    /**
     * Método sincronizado para depositar dinero en la cuenta bancaria. 
     * @param cantidad La cantidad de dinero a depositar.
     */
    public synchronized void depositarDinero(int cantidad){
        System.out.println("Antes de depositar el saldo actual es"+saldo);
        saldo += cantidad;
        System.out.println("Se depositaron "+cantidad+" pesos");
                notifyAll();
    }
    /**
     * Método sincronizado para extraer dinero de la cuenta bancaria. 
     * @param cantidad La cantidad de dinero a extraer.
     */
    public synchronized void extraerDinero(int cantidad){
        try{
            if(saldo<=0){
                System.out.println(getName()+" Espera depOsito"+"\nSaldo restante"+saldo);
                sleep(5000);
            }
        } catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Antes de retirar el saldo actual es"+saldo);
        saldo -= cantidad;
        System.out.println(getName()+" Extrajo "+cantidad+" Pesos. \nSaldo restante"+saldo);
        notifyAll();
    }  
}

