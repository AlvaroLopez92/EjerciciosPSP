package exej3;

import java.util.Random;


public class ExEj3 {

    public static void main(String[] args) throws InterruptedException {

    Random rand = new Random(); 
    int i=1;
    
        for(i=1;i<=8;i++){

    System.out.println("Hilo 1, ejecución "+(i));
    
    
    }
    System.out.println("El primer fío ha terminado su ejecución");
    Thread.sleep(rand.nextInt(1000));
    
        for(i=1;i<=8;i++){ 
    System.out.println("Hilo 2, ejecución "+(i));

    
    }
    System.out.println("El segundo fío ha terminado su ejecución");
    Thread.sleep(rand.nextInt(1000));
    
        for(i=1;i<=8;i++){ 
    System.out.println("Hilo 3, ejecución "+(i));

    
    }
    System.out.println("El tercer fío ha terminado su ejecución");
    Fios.sleep(400);
    
        for(i=1;i<=8;i++){ 
    System.out.println("Hilo 4, ejecución "+(i));

    
    }
    System.out.println("El cuarto fío ha terminado su ejecución");
    Fios.sleep(400);
    
        for(i=1;i<=8;i++){ 
    System.out.println("Hilo 5, ejecución "+(i));

    
    }
    System.out.println("El quinto fío ha terminado su ejecución");
    Fios.sleep(400);
    
    System.out.println("Los cinco fíos han terminado su ejecución");

    

        
    }
    
}