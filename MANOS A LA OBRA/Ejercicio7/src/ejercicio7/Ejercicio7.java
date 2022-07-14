package ejercicio7;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.print("Ingrese numero correspondiente al tipo de motor: ");
        int tipoMotor = leer.nextInt ();
        switch (tipoMotor){
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de\n" +
"gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de\n" +
"hormigón");
                break;  
            case 4:
                System.out.println("La bomba es una bomba de pasta\n" +
"alimenticia");
                break; 
            default:
                System.out.println("No existe un valor\n" +
"válido para tipo de bomba5");
            
        }
        
    }
    
}
