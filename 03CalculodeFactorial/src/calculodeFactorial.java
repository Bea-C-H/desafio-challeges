import java.util.Scanner;

public class calculodeFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número entero no negativo: ");
            try {
                int numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("❌ Error: El número no puede ser negativo.");
                    continue;
                }

                // Cálculo iterativo
                long resultadoIterativo = calcularFactorialIterativo(numero);

                // Cálculo recursivo
                long resultadoRecursivo = calcularFactorialRecursivo(numero);

                // Mostrar resultados
                System.out.println("Iterativo: " + mostrarExpresion(numero) + " = " + resultadoIterativo);
                System.out.println("Recursivo: " + resultadoRecursivo);

            } catch (Exception e) {
                System.out.println("❌ Entrada inválida. Por favor ingresa un número entero.");
                scanner.next(); // limpiar entrada
                continue;
            }

            // Preguntar si quiere repetir
            System.out.print("¿Desea calcular otro factorial? (si/no): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;
            }
        }

        scanner.close();
        System.out.println("¡Gracias por usar el programa!");
    }

    // Método iterativo
    public static long calcularFactorialIterativo(int n) {
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método recursivo
    public static long calcularFactorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFactorialRecursivo(n - 1);
    }

    // Método para mostrar la expresión completa (ej: 5 × 4 × 3 × 2 × 1)
    public static String mostrarExpresion(int n) {
        StringBuilder expresion = new StringBuilder();
        for (int i = n; i > 0; i--) {
            expresion.append(i);
            if (i != 1) {
                expresion.append(" × ");
            }
        }
        return expresion.toString();
    }
}

