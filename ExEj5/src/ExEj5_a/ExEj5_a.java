package exej5_a;


public class ExEj5_a extends Thread implements Runnable {
         
    public void run(){
        
    System.out.println("running thread name is:"+Thread.currentThread().getName());  
    System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
        
    }
    
    
    public static void main(String[] args) throws InterruptedException {
    
    ExEj5_a fio1 = new ExEj5_a ();
    fio1.setName("fio1");
    ExEj5_a fio2 = new ExEj5_a ();
    fio2.setName("fio2");


    
    fio1.join();
    fio2.start();
    fio1.start();
        
 
        
    }
}
