package exej4;

public class ExEj4 extends Thread implements Runnable {
    

public static void main(String[] args) throws InterruptedException {
        
    
    Thread paresamil = new Thread(() -> {
          
    int suma=0;  
    String cad="";
    for(int i=0;i<=1000;i=i+2){
        cad=cad+" "+i;
        suma=suma+i;
    }
    System.out.println(cad);
    System.out.println(suma);
            
        System.out.println(suma);
            
        });
        
    Thread imparesamil = new Thread(() -> {
          
    int suma=0;  
    String cad="";
    for(int i=1;i<=1000;i=i+2){
        cad=cad+" "+i;
        suma=suma+i;
    }
    System.out.println(cad);
    System.out.println(suma);
            
        System.out.println(suma);
            
        });
    
    
    paresamil.start();
    imparesamil.start();
        
}
}
