import java.time.LocalDate;
import java.util.Scanner;

public class calculadoraEdadYCategoriaEtaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anioActual = LocalDate.now().getYear();

        System.out.println("🎉 Bienvenido al programa de cálculo de edad 🎉");

        int anioNacimiento = solicitarAnioNacimiento(scanner, anioActual);
        int edad = calcularEdad(anioNacimiento, anioActual);
        String categoria = obtenerCategoria(edad);

        System.out.println("👤 Tienes " + edad + " años.");
        System.out.println("📊 Categoría: " + categoria);

        mostrarMensajePersonalizado(edad);

        scanner.close();
    }

    // Método para solicitar el año de nacimiento con validación
    private static int solicitarAnioNacimiento(Scanner scanner, int anioActual) {
        int anioNacimiento;
        while (true) {
            try {
                System.out.print("👉 Ingresa tu año de nacimiento (ej. 1990): ");
                anioNacimiento = scanner.nextInt();

                if (anioNacimiento < 1900 || anioNacimiento > anioActual) {
                    System.out.println("⚠️ Ingresa un año entre 1900 y " + anioActual + ".");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("⚠️ Entrada inválida. Por favor, ingresa un número entero.");
                scanner.next(); // limpiar entrada inválida
            }
        }
        return anioNacimiento;
    }

    // Método para calcular edad
    private static int calcularEdad(int anioNacimiento, int anioActual) {
        return anioActual - anioNacimiento;
    }

    // Método para obtener categoría etaria
    private static String obtenerCategoria(int edad) {
        if (edad <= 12) {
            return "👶 Niño/a";
        } else if (edad <= 17) {
            return "🧒 Adolescente";
        } else if (edad <= 30) {
            return "🧑 Joven adulto";
        } else if (edad <= 59) {
            return "🧑 Adulto";
        } else {
            return "👴 Adulto mayor";
        }
    }

    // Método para mostrar mensaje personalizado
    private static void mostrarMensajePersonalizado(int edad) {
        if (edad < 18) {
            System.out.println("💬 ¡Qué joven eres!");
        } else if (edad <= 30) {
            System.out.println("💬 ¡Edad perfecta para seguir aprendiendo Java!");
        } else if (edad > 60) {
            System.out.println("💬 ¡Nunca es tarde para programar!");
        }
    }
}
