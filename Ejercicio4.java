import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("a (entero): ");
                int a = Integer.parseInt(sc.nextLine().trim());

                System.out.print("b (entero): ");
                int b = Integer.parseInt(sc.nextLine().trim());

                if (b == 0) {
                    System.out.println("No se puede dividir entre cero.");
                } else {
                    int divisionEntera = a / b; // división entera
                    double divisionReal = (double) a / b; // división real

                    System.out.println("División entera a/b = " +
                            divisionEntera);
                    System.out.printf("División real a/b = %.4f%n",
                            divisionReal);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese números enteros válidos.");
            }
        }
    }
}