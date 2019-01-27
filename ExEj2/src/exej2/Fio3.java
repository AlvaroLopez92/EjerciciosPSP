/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exej2;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Fio3 extends Thread  {
    public void run(){
        
    Random rand = new Random(); 
    int i=1;

    
    for(i=1;i<=5;i++){
    //Se imprime el número del hilo que se ejecuta y el número de iteración.
    System.out.println("Hilo 3, ejecución "+(i));
        try {
            //El fío entra en modo de bloqueo durante el tiempo que se estipule en la siguiente función.
            Thread.sleep(rand.nextInt(1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(Fio1.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("El tercer fío ha terminado su ejecución");
    }
    }
    
}