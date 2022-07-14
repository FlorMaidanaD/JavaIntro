package introjava;
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre:");
        String nombre = leer.nextLine();
     
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");
    }
    
}
