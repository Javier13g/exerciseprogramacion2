
import java.util.Scanner;
/**
 *
 * @author abdiel
 */
public class Ejercicio1 { 
    public static void main(String[] args) { 
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.print("Ingrese el primer entero: "); 
            String aStr = sc.nextLine(); 
 
            System.out.print("Ingrese el segundo entero: "); 
            String bStr = sc.nextLine(); 
 
            int a = Integer.parseInt(aStr.trim()); 
            int b = Integer.parseInt(bStr.trim()); 
 
            int suma = a + b; 
            System.out.println("Suma = " + suma); 

            int resta = a - b;
            System.out.println("Resta = " + resta);

            int multiplicacion = a * b;
            System.out.println("Multiplicación = " + multiplicacion);

            if (b != 0) {
                double division = (double) a / b;
                System.out.println("División = " + division);
            } else {
                System.out.println("División = Error: División por cero no permitida.");
            }

            int raizCuadradaA = (int) Math.sqrt(a);
            System.out.println("Raíz cuadrada de " + a + " = " + raizCuadradaA);

            int raizCuadradaB = (int) Math.sqrt(b);
            System.out.println("Raíz cuadrada de " + b + " = " + raizCuadradaB);
        } catch (NumberFormatException ex) { 
            System.out.println("Error: Debe ingresar valores enteros válidos."); 
        } 
    } 
} 