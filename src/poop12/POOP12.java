/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 * Clase principal que explora el uso de hilos 
 * @author brismar
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * Creación y ejecución de hilos HiloT
         */
        /*
        HiloT hilo1 = new HiloT("Primer hilo");
        hilo1.start();
        new HiloT("Segundo Hilo").start();
        new Thread(new HiloR(), "Tercer hilo").start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+i+" del main");           
        }       
        System.out.println("Termina el Main");
        */
        /**
         * Creación y ejecución de hilos HiloCeros, HiloUnos, HiloSaltoDeLinea
         */
        
        /*
        new Thread(new HiloCeros(),"Hilos de ceros").start();
        new Thread(new HiloUnos(),"Hilos de unos").start();
        new Thread(new HiloSaltoDeLinea(), "Hilo Salto De Linea").start();
        */
        /**
         * Creación y ejecución de hilos RetiroUno
         */
        /*
        new RetiroUno("Acceso 1").start();
        new RetiroUno("Acceso 2").start();
        new RetiroUno("Deposito 1").start();
        new RetiroUno("Deposito 2").start();
        System.out.println("Termina elhilo principal ");
        */
        /*
        //actividad extra realizar un HILO que se dedique a imprimir los numeros pares desde el 0-500
        //actividad extra realizar un HILO que se dedique a imprimir los numeros IMPARES desde el 0-500
        */
        
        /**
         * Creación y ejecución de hilos HilosPares y HiloImpares
         */
        new Thread(new HilosPares(),"Hilo con numeros pares").start();
        
        //new Thread(new HiloImpares(),"Hilo con numeros impares").start();
    }
    
}