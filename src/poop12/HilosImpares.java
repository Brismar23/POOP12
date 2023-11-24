/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * La clase HilosImpares implementa la interfaz Runnable y representa un hilo
 * que realiza un bucle simple, imprimiendo números impares seguidos de un guion.
 * @author brismar
 */
public class HilosImpares implements Runnable {
    /**
     * método realiza un for simple que imprime números impares
     * seguidos de un guion ("-") para demostrar la ejecución con una tamaño de 500. 
     */
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            int j;
            j=i%2;
            if (j!=0) {
                System.out.print(i+"-");
            }       
        }
    }    
    
}