import java.util.Scanner;

/**
 *
 * @author abdiel
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n== Conversion Temperatura ==");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Celsius a Kelvin");
            System.out.println("3. Fahrenheit a Celsius");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1" -> {
                    try {
                        System.out.print("Ingrese temperatura en Celsius: ");
                        double celsius = Double.parseDouble(scanner.nextLine().trim());
                        double fahrenheit = (celsius * 1.8) + 32.0;
                        System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    }
                }
                case "2" -> {
                    try {
                        System.out.print("Ingrese temperatura en Celsius: ");
                        double celsius = Double.parseDouble(scanner.nextLine().trim());
                        double kelvin = celsius + 273.15;
                        System.out.println("Temperatura en Kelvin: " + kelvin);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número.");
                    }
                }
                case "3" -> {
                    try {
                        System.out.print("Ingrese temperatura en Fahrenheit: ");
                        double fahrenheit = Double.parseDouble(scanner.nextLine().trim());
                        double celsius = (fahrenheit - 32.0) / 1.8;
                        System.out.println("Temperatura en Celsius: " + celsius);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número."); 
                    }
                }
                case "4" -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}
