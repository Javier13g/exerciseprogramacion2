import java.util.Scanner;
/**
 *
 * @author abdiel
 */
 
public class Ejercicio2 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        try {
            System.out.print("Numero de calificaciones: ");
            int numbersCount = Integer.parseInt(sc.nextLine().trim());
            if (numbersCount <= 0) {
                System.out.println("Error: el número de calificaciones debe mayor a 0.");
            }
            
            double sum = 0;
            for (int i = 1; i <= numbersCount; i++) {
                System.out.print("Calificación " + i + ": ");
               sum += Double.parseDouble(sc.nextLine().trim());
            }

            double average = sum / numbersCount;
            System.out.println("Promedio Calificaciones= " + average);
        } catch (NumberFormatException e) { 
            System.out.println("Error: ingrese números válidos (use punto para decimales)."); 
        } finally { 
            sc.close(); 
        } 
    } 
}