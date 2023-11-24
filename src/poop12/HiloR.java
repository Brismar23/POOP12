/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * La clase HiloR implementa la interfaz Runnable y representa un hilo
 * que realiza un for simple, imprimiendo información sobre su iteración.
 * @author brismar
 */
public class HiloR implements Runnable{
    /**
     *Este método realiza un bucle simple que imprime información sobre
     * la iteración actual y el nombre del hilo que lo está ejecutando.
     */
    @Override
    public void run() {
        for (int i =0; i < 10; i++){
            System.out.println("Iteracion "+ i + " del "+ Thread.currentThread().getName());
        }
        System.out.println("Termina el "+ Thread.currentThread().getName());
    }    
}
