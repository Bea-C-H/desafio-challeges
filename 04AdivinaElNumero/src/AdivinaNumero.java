import java.util.Scanner; // Scanner sirve para leer lo que escribe el usuario
import java.util.Random; // Random sirve para génerar el número secreto
public class AdivinaNumero {
    public static void main(String[] args) {
        // aqui ira todo el código
        //este es el punto de entrada del programa cuando lo ejecute buscará main
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        boolean jugarDeNuevo = true;
        System.out.println("Bienvenido al Juego ¡Adivina el número!");
        /**
         * creamos objetos para leer entradas y generar número aleatorio
         * jugarDeNuevo e sun flag por si el usuario quiere repetir el juego
         */

        //Ahora creamos el bucle para jugar
        while (jugarDeNuevo) {
            int numeroSecreto = random.nextInt(100) + 1 ; //genera del 1 al 100
            //generamos el numero secreto
            int intentosMaximos = 7;
            int intentosHechos =0;
            boolean adivinado = false;
            StringBuilder historialIntentos = new StringBuilder(); //usamos StringBuilder para guardar los intentos fallidos


            //se crea el bucle de intentos
            while (intentosHechos < intentosMaximos) {
                System.out.print(" ingresa tu intento #" + (intentosHechos + 1) + ": ");
                int intento;
                //pedimos numero

                if (scanner.hasNextInt()) {
                    intento = scanner.nextInt();
                    if (intento < 1 || intento > 100) {
                        System.out.println("El numero debe estar entre 1 y 100");
                        continue;
                        //validamos si es nuemro (hasNextInt)
                    }

                } else {
                    System.out.println("No es un número válido");
                    scanner.next();
                    continue;
                    //si esta fuera de rango lo rechazamos sin contar el intento
                    //si no es un número, lo limpiamos con scanner.next
                }
                intentosHechos++;
                historialIntentos.append(intento).append(" "); //sumamos el intento
                //guardamos en el historial

                if (intento == numeroSecreto) {
                    System.out.println("¡ESAAAAAA! Adivinaste el número en " + intentosHechos + " intentos.");
                    adivinado = true;
                    break; //comparamos con el numero secreto
                } else if (intento < numeroSecreto) {
                    System.out.println("El número secreto es mayor.");
                } else {
                    System.out.println("El número secreto es menor.");
                }  //mostramos mensaje si es mayor o menor

                int intentosRestantes = intentosMaximos - intentosHechos;
                if (intentosRestantes > 0) {
                    System.out.println("Intentos restantes: " + intentosRestantes);
                } else {
                    System.out.println(" No te quedan más intentos.");
                }
            }
            if (adivinado) {
                System.out.println("El número correcto era: " + numeroSecreto);
                System.out.println("Tus intentos fueron: " + historialIntentos);
            }
            //si no adivina, mostramos el numero y los intentos fallidos

            System.out.print("¿Quieres jugar otra ronda? (si/no): ");
            String respuesta = scanner.next();
            jugarDeNuevo = respuesta.equalsIgnoreCase("si");

            System.out.println(" ¡Gracias por jugar! ¡Pensar es importante!");

        }



    }



        }
