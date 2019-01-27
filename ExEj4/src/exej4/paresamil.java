package exej4;

class paresamil extends Thread implements Runnable {
            
    public void run(){
            
       int suma=0;  
       String cad="";
       for(int i=0;i<=1000;i=i+2){
           cad=cad+" "+i;
           suma=suma+i;
       }
       System.out.println(cad);
       System.out.println(suma);
            
            System.out.println(suma);
            
        }
    
}
