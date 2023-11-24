/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 * La clase HiloT extiende la clase Thread
 * @author brismar
 */
public class HiloT extends Thread{
    /**
     * Construye un nuevo objeto HiloT con el nombre especificado.
     * 
     * @param name El nombre que se asignará al hilo.
     */
    public HiloT(String name) {
        super(name);
    }   
    
    /**
     * Metodo sobre escrtito - que se ejecuta cuando el hilo es iniciado mediante start.
     */
    
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Iteracion "+ i + " de "+ getName());
        }
        System.out.println("Termina el " + getName());
    }
}
