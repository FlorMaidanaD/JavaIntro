
package ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
  
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese un true o false: ");
       boolean log = leer.nextBoolean();
        System.out.print("Ingrese un numero real: ");
       double num1 = leer.nextDouble();
        System.out.print("Ingrese un caracter: ");
       char x = leer.next().charAt(0);
        System.out.println("las variables tienen: " + log + " - " + num1 + " - "+ x);
       
    }
    
}
