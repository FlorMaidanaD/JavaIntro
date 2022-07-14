package ejercio9;
import java.util.Scanner;

public class Ejercio9 {   
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese numeros enteros (20 max.)");
        System.out.println("Cuando ingrese el 0 sale, ");
        int suma = 0;
        int x = 0;
        int y = 0;
        do {
            y = y + 1;
            System.out.print("Valor " + y + " ingrese: ");
            x = leer.nextInt();
            if (x>0) {
                suma= suma + x;                
            }else{
                System.out.println("Se capturó el número 0");
                break;
            }            
            } while (y < 20);
        System.out.println("La suma de los valores que ingresó es " + suma);
    }
}
