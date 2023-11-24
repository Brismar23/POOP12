/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * La clase HilosPares implementa la interfaz Runnable y representa un hilo
 * que realiza un FOR,pero ahora con numeros pares. 
 * @author brismar
 */
public class HilosPares implements Runnable {
    /**
     * Realiza un for  que imprime números pares
     */
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            int j;
            j=i%2;
            if (j==0) {
                System.out.print(i+"-");
            }           
        }        
    }    
}
