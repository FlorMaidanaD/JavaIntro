
package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {
    
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      String frase;
      String codi;       
      System.out.println("Ingrese una frase a codificar (Termina con punto)");
      //falta validar el ultimo caracter, ver si es un punto
      frase= leer.nextLine();
      codi = codificar (frase);
      System.out.println("La frase codificada es: ");
      System.out.println(codi);
              
    }
    
    
    public static String codificar (String frase) {
        Scanner leer= new Scanner (System.in);
        String codi ="";  
        String x;
        for (int i = 0; i < frase.length(); i++) {
            x = frase.substring(i,i+1);
            switch (x){
                case "a":
                    x = "@";
                    break;
                case "e":
                    x = "#";
                    break;
                case "i":
                    x = "$";
                    break;
                case "o":
                    x = "%";
                    break;
                case "u":
                    x = "*";
                    break;
                default:
                    break;
            }
            codi= codi.concat(x);
        }           
        return codi;
    }
}
