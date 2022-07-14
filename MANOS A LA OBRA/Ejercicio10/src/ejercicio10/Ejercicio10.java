/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
*/

package ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese valor limite positivo");
        int x = leer.nextInt();
        int suma=0;
        do{
            System.out.print("Ingrese un numero: ");
            suma=suma+leer.nextInt();
            
        }while (suma<x); 
        
        
        
        
        
    }
}
