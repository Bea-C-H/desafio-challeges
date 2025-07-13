<<<<<<< HEAD
# Desafío Técnico: Calculadora de Edad y Categoría Etaria

## Descripción

Escribe un programa en Java que solicite al usuario su **año de nacimiento** y, en base al año actual, calcule su **edad**. Luego, clasifica al usuario en una **categoría etaria** según su edad.

> Este desafío permite practicar entrada de datos, cálculos con fechas, estructuras condicionales, operadores y lógica aplicada a la vida real. ¡Perfecto para pulir habilidades de entrevistas!
=======
# Desafío Técnico: Conversor Bidireccional de Temperaturas

## Descripción

Diseña un programa en Java que permita convertir temperaturas entre **Celsius y Fahrenheit**, según la elección del usuario. El programa debe solicitar qué tipo de conversión desea realizar (de Celsius a Fahrenheit o viceversa), luego pedir el valor a convertir, y finalmente mostrar el resultado correspondiente.

> Este desafío está diseñado para evaluar tus habilidades en entrada/salida de datos, estructuras de control, uso de operadores, claridad en la lógica, y capacidad para manejar decisiones del usuario.
>>>>>>> d7c07ffec5b4c44d8cffa9ccf006134d53cd59d9

---

## Requisitos

<<<<<<< HEAD
1. Solicitar al usuario su **año de nacimiento**.
2. Calcular la edad tomando como referencia el año actual (puedes obtenerlo dinámicamente).
3. Mostrar la edad con un mensaje amigable.
4. Determinar la **categoría etaria** usando las siguientes reglas:

   | Edad | Categoría           |
   |------|----------------------|
   | 0-12 | Niño/a               |
   | 13-17 | Adolescente         |
   | 18-25 | Joven Adulto/a      |
   | 26-59 | Adulto/a            |
   | 60+   | Adulto/a Mayor      |
=======
1. El programa debe mostrar un **menú interactivo** que permita al usuario elegir entre las siguientes opciones:
   - Convertir de **Celsius a Fahrenheit**
   - Convertir de **Fahrenheit a Celsius**

2. Según la opción elegida, debe solicitar el valor numérico a convertir y aplicar la fórmula adecuada:

   - Fahrenheit = (Celsius × 9/5) + 32  
   - Celsius = (Fahrenheit − 32) × 5/9

3. Mostrar la temperatura convertida con **1 decimal de precisión**, acompañado del texto explicativo.
>>>>>>> d7c07ffec5b4c44d8cffa9ccf006134d53cd59d9

---

## Ejemplo de Ejecución

<<<<<<< HEAD
```
Ingrese su año de nacimiento: 1995 

Tienes 30 años. 

Tu categoría etaria es: Adulto/a.
=======
Caso 1: 
```
Seleccione el tipo de conversión:

1) Celsius a Fahrenheit
2) Fahrenheit a Celsius

Seleccione una opción: 1
Ingrese la temperatura en grados Celsius: 30

30.0 grados Celsius equivale a 86.0 grados Fahrenheit.
```
Caso 2: 

```Seleccione el tipo de conversión:

1) Celsius a Fahrenheit
2) Fahrenheit a Celsius

Seleccione una opción: 2
Ingrese la temperatura en grados Fahrenheit: 86

86.0 grados Fahrenheit equivale a 30.0 grados Celsius.
>>>>>>> d7c07ffec5b4c44d8cffa9ccf006134d53cd59d9
```

---

## Puntos Extra 🔥

<<<<<<< HEAD
Eleva tu solución incorporando alguna de estas mejoras:

- ✅ Obtener el año actual automáticamente con `LocalDate.now().getYear()`.
- ✅ Validar que el año ingresado sea razonable (mayor a 1900 y menor o igual al actual).
- ✅ Mostrar mensajes personalizados según la categoría:
  - "¡Qué joven eres!" para menores de 18
  - "¡Edad perfecta para seguir aprendiendo Java!" para entre 18 y 30
  - "¡Nunca es tarde para programar!" para mayores de 60
- ✅ Separar la lógica en métodos como `calcularEdad()` y `obtenerCategoria()` para mayor claridad.
- ✅ Implementar manejo de errores con `try-catch` y control de inputs no válidos.
=======
Eleva el nivel de tu solución incorporando alguno o varios de los siguientes elementos:

- ✅ **Uso de operadores ternarios** para tomar decisiones simples.
- ✅ **Validación de entrada del usuario**, como valores negativos extremos o no numéricos.
- ✅ **Modularización** del código utilizando métodos reutilizables para cada conversión.
- ✅ Mostrar un **mensaje de error elegante** si el usuario ingresa una opción inválida en el menú.
- ✅ Implementar una **interfaz de bucle** que permita repetir el proceso hasta que el usuario decida salir.
- ✅ Añadir soporte para leer la entrada con **Scanner** y **manejar excepciones** (por ejemplo, `InputMismatchException`).
- ✅ Usar `switch` en lugar de `if` para practicar estructuras de control más organizadas.
>>>>>>> d7c07ffec5b4c44d8cffa9ccf006134d53cd59d9

---

## Bonus Avanzado 🚀

<<<<<<< HEAD
- Permitir ingresar **fecha completa (dd/mm/yyyy)** y calcular edad exacta considerando el mes y día.
- Agregar un bucle que permita calcular varias edades sin reiniciar el programa.
- Implementar mensajes en distintos idiomas (español/inglés) según preferencia del usuario.
=======
- Crea una versión en la que el programa **detecte automáticamente la unidad introducida** (por ejemplo, `30C` o `86F`) y realice la conversión correcta sin menú.
- Muestra además si la temperatura ingresada representa una **condición extrema** (ej. "¡Temperatura de congelación!", "¡Temperatura de ebullición!", etc.)

---

## Sugerencias

- Usa `Math.round(valor * 10.0) / 10.0` o `System.out.printf("%.1f", valor)` para formatear el resultado a un decimal.
- Nombres de métodos claros como `convertCelsiusToFahrenheit()` y `convertFahrenheitToCelsius()` son altamente recomendados.
>>>>>>> d7c07ffec5b4c44d8cffa9ccf006134d53cd59d9

---

## ¿Qué se evalúa?

<<<<<<< HEAD
- Lógica de programación.
- Manejo de fechas y condicionales.
- Validación de entradas.
- Uso adecuado de métodos y control de flujo.
- Legibilidad y calidad del código.

---

¿Listo para descubrir cuántos años de código tienes por delante? 🧓🧒 ¡A programar!
=======
- Claridad y legibilidad del código.
- Uso adecuado de estructuras de control.
- Buen manejo de errores e inputs.
- Aplicación de buenas prácticas en Java.
- Capacidad para modularizar y extender la funcionalidad del programa.

---

¿Listo para convertir el frío en calor (y viceversa)? ¡Manos al código!
>>>>>>> d7c07ffec5b4c44d8cffa9ccf006134d53cd59d9
