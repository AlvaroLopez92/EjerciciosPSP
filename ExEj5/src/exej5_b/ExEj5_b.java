package exej5_b;


public class ExEj5_b extends Thread implements Runnable {
         
    public void run(){
        
    
        
    System.out.println("running thread name is:"+Thread.currentThread().getName());  
    System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
        
    }
    
    
    public static void main(String[] args) {
    
    ExEj5_b fio1 = new ExEj5_b ();
    fio1.setName("fio1");
    fio1.setPriority(Thread.MIN_PRIORITY);
    ExEj5_b fio2 = new ExEj5_b ();
    fio2.setName("fio2");
    fio2.setPriority(Thread.MAX_PRIORITY);


    
    
    fio2.start();
    fio1.start();
        
 
        
    }
}
