# Desafío Técnico: Conversor Bidireccional de Temperaturas

## Descripción

Diseña un programa en Java que permita convertir temperaturas entre **Celsius y Fahrenheit**, según la elección del usuario. El programa debe solicitar qué tipo de conversión desea realizar (de Celsius a Fahrenheit o viceversa), luego pedir el valor a convertir, y finalmente mostrar el resultado correspondiente.

> Este desafío está diseñado para evaluar tus habilidades en entrada/salida de datos, estructuras de control, uso de operadores, claridad en la lógica, y capacidad para manejar decisiones del usuario.

---

## Requisitos

1. El programa debe mostrar un **menú interactivo** que permita al usuario elegir entre las siguientes opciones:
   - Convertir de **Celsius a Fahrenheit**
   - Convertir de **Fahrenheit a Celsius**

2. Según la opción elegida, debe solicitar el valor numérico a convertir y aplicar la fórmula adecuada:

   - Fahrenheit = (Celsius × 9/5) + 32  
   - Celsius = (Fahrenheit − 32) × 5/9

3. Mostrar la temperatura convertida con **1 decimal de precisión**, acompañado del texto explicativo.

---

## Ejemplo de Ejecución

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
```

---

## Puntos Extra 🔥

Eleva el nivel de tu solución incorporando alguno o varios de los siguientes elementos:

- ✅ **Uso de operadores ternarios** para tomar decisiones simples.
- ✅ **Validación de entrada del usuario**, como valores negativos extremos o no numéricos.
- ✅ **Modularización** del código utilizando métodos reutilizables para cada conversión.
- ✅ Mostrar un **mensaje de error elegante** si el usuario ingresa una opción inválida en el menú.
- ✅ Implementar una **interfaz de bucle** que permita repetir el proceso hasta que el usuario decida salir.
- ✅ Añadir soporte para leer la entrada con **Scanner** y **manejar excepciones** (por ejemplo, `InputMismatchException`).
- ✅ Usar `switch` en lugar de `if` para practicar estructuras de control más organizadas.

---

## Bonus Avanzado 🚀

- Crea una versión en la que el programa **detecte automáticamente la unidad introducida** (por ejemplo, `30C` o `86F`) y realice la conversión correcta sin menú.
- Muestra además si la temperatura ingresada representa una **condición extrema** (ej. "¡Temperatura de congelación!", "¡Temperatura de ebullición!", etc.)

---

## Sugerencias

- Usa `Math.round(valor * 10.0) / 10.0` o `System.out.printf("%.1f", valor)` para formatear el resultado a un decimal.
- Nombres de métodos claros como `convertCelsiusToFahrenheit()` y `convertFahrenheitToCelsius()` son altamente recomendados.

---

## ¿Qué se evalúa?

- Claridad y legibilidad del código.
- Uso adecuado de estructuras de control.
- Buen manejo de errores e inputs.
- Aplicación de buenas prácticas en Java.
- Capacidad para modularizar y extender la funcionalidad del programa.

---

¿Listo para convertir el frío en calor (y viceversa)? ¡Manos al código!