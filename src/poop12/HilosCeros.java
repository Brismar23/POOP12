/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * a clase HilosCeros implementa la interfaz Runnable y representa un hilo
 * que realiza un for, va imprimir el carácter "0" mil veces.
 * @author brismar
 */
public class HilosCeros implements Runnable{
    /**
     *Este método realiza un bucle simple que imprime el carácter "0"
     * mil veces para demostrar la ejecución concurrente.
     */
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("0");
            
        }   
    }   
}

