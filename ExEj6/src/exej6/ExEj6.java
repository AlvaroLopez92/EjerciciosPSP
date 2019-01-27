package exej6;


import java.util.Random;

public class ExEj6 extends Thread implements Runnable {
    
    int saldo=200;
    int saldoingresado = 0;
    int saldoextraido = 0;
    int transaccion = 0;
    int saldofinal = 0;
    
    public class ingresos extends Thread{
        public void run(){

        Random rand = new Random();

        for(int i=0;i<=10;i++){
           transaccion = saldo+(rand.nextInt(50)*10);
        }
            saldoingresado = saldo+transaccion;
            System.out.println("Tras 10 ingresos, el saldo es de "+ saldoingresado);  
        }
    }

    public class extraccions extends Thread{
    //Thread extraccions = new Thread(){
        public void run(){

        Random rand = new Random();
       
        for(int i=0;i<=10;i++){
           transaccion = saldo-(rand.nextInt(50)*5);
        }
            saldoextraido = saldo-transaccion;
            System.out.println("Tras 5 extracciones, el saldo es de "+ saldoextraido);  
        }     
    }

            


    public static void main(String[] args) {
        
    Thread ingresos = new Thread ();
    Thread extraccions = new Thread();
    
    
    ingresos.start();
    extraccions.start();
    
    
    }
    
}
