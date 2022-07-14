
package ej6;
import java.util.Scanner;
public class Ej6 {

    
    public static void main(String[] args) {
    Scanner leer= new Scanner (System.in);    
        System.out.print("Ingrese el primer numero entero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int num2 = leer.nextInt();
        if (num1 > 25) {
            if (num2>25){
                System.out.println("Ambos numeros son mayores que 25");
            }
            else{
                System.out.println("Solo el primer numero es mayor a 25");
            }  
        }
        else if(num2 > 25){
                  System.out.println("Solo el segundo numero es mayor a 25");
        }       
        else{
                System.out.println("Ninguno de los dos numeros son mayores a 25");
        }
        
    }
}
