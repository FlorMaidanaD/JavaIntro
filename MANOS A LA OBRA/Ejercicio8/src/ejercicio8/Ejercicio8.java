
package ejercicio8;
import java.util.Scanner;

public class Ejercicio8 {
//|| es el o y && es el y, != distinto
   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una nota: ");
        int nota = leer.nextInt ();
        while (nota>10 || nota <0) {
            System.out.print ("La nota que usted ingresó no es valida");
            System.out.println("Reingrese la nota (de 0 a 10)");
            nota = leer.nextInt();    
        }
        System.out.println("Gracias!!!");           
        }
        
    }
 

    

