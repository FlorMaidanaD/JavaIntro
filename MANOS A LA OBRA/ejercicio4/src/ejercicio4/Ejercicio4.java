package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String  nombre;
        int edad;
        System.out.println("Ingresa tu nombre: ");
         nombre = leer.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad =  leer.nextInt();
        System.out.println("Usted es " + nombre+ " y tiene " + edad + " años.");
    }
    
}
