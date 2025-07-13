import java.util.InputMismatchException;
import java.util.Scanner;

public class conversorTemperatura {
}

class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("🌡️ === Conversor de Temperaturas === 🌡️");

        while (continuar) {
            System.out.println("\nSelecciona el tipo de conversión:");
            System.out.println("1️⃣  Celsius a Fahrenheit");
            System.out.println("2️⃣  Fahrenheit a Celsius");
            System.out.println("3️⃣  Salir");
            System.out.print("👉 Opción: ");

            int opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    System.out.print("🌡️ Ingresa la temperatura en Celsius: ");
                    double celsius = leerDecimal(scanner);
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.printf("✅ %.2f °C son %.2f °F%n", celsius, fahrenheit);
                    break;

                case 2:
                    System.out.print("🌡️ Ingresa la temperatura en Fahrenheit: ");
                    fahrenheit = leerDecimal(scanner);
                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.printf("✅ %.2f °F son %.2f °C%n", fahrenheit, celsius);
                    break;

                case 3:
                    continuar = false;
                    System.out.println("👋 ¡Gracias por usar el conversor! ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("❌ Opción inválida. Por favor, elige 1, 2 o 3.");
            }
        }

        scanner.close();
    }

    // Método para leer enteros con validación
    private static int leerEntero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("⚠️ Entrada inválida. Ingresa un número entero: ");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
    }

    // Método para leer decimales con validación
    private static double leerDecimal(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.print("⚠️ Entrada inválida. Ingresa un número decimal: ");
                scanner.next(); // Limpiar entrada incorrecta
            }
        }
    }
}
