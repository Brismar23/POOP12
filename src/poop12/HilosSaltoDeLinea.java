/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * La clase HilosSaltoDeLinea implementa la interfaz Runnable y representa un hilo
 * que realiza un for simple, imprimiendo un salto de línea mil veces.
 * @author brismar
 */
public class HilosSaltoDeLinea implements Runnable{
    /**
     * método que realiza un bucle simple que imprime un salto de línea
     * mil veces para demostrar la ejecución concurrente
     */
    @Override
    public void run() {
        for(int i =0; i<1000; i++){
            System.out.println("");
        }   
    }
}
