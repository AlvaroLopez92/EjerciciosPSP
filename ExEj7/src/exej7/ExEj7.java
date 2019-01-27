package exej7;

import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JOptionPane;


public class ExEj7 {
    

    
public static void main(String[] args) {


    int buzonOcupado = 0;
    String cartaEntrante = null;
    String cartaSaliente = null;
    
    Thread metercarta = new Thread(() -> {

    cartaEntrante  escribiendo = JOptionPane.showInputDialog("Escribe el mensaje");
    buzonOcupado = 1;
    });

    Thread sacarcarta = new Thread(() -> {

    if (buzonOcupado == 1){
  
    System.out.println(cartaEntrante);
    }

    });

    metercarta.start();
    sacarcarta.start();
    }

}
