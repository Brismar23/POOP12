/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * La clase HilosUnos implementa la interfaz Runnable y representa un hilo
 * que realiza un for simple, imprimiendo el carácter "i-" mil veces.
 * @author brismar
 */
public class HilosUnos implements Runnable {
    /**
     * Método run() que se ejecuta cuando el hilo es iniciado.
     */
    @Override
    public void run() {
        for(int i =0; i<1000; i++){
            System.out.println("i-");
        }
    }   
}
