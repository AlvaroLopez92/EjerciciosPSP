/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exej1;

import java.util.Random;

public class ExEj1 {


    public static void main(String[] args) throws InterruptedException {
    
    
    Random rand = new Random(); 
    
    int i=1;

    
    for(i=1;i<=8;i++){
    System.out.println("Hilo 1, ejecución "+(i));
    Thread.sleep(rand.nextInt(1000));
    }
    System.out.println("El primer fío ha terminado su ejecución");
    for(i=1;i<=8;i++){ 
    System.out.println("Hilo 2, ejecución "+(i));
    Thread.sleep(rand.nextInt(1000));
    }
    System.out.println("El segundo fío ha terminado su ejecución");
    for(i=1;i<=8;i++){ 
    System.out.println("Hilo 3, ejecución "+(i));
    Thread.sleep(rand.nextInt(1000));
    }
    System.out.println("El tercer fío ha terminado su ejecución");
    
    System.out.println("Los tres fíos han terminado su ejecución");

    
    }
    
}
