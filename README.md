# Desafío Técnico: Calculadora de Edad y Categoría Etaria

## Descripción

Escribe un programa en Java que solicite al usuario su **año de nacimiento** y, en base al año actual, calcule su **edad**. Luego, clasifica al usuario en una **categoría etaria** según su edad.

> Este desafío permite practicar entrada de datos, cálculos con fechas, estructuras condicionales, operadores y lógica aplicada a la vida real. ¡Perfecto para pulir habilidades de entrevistas!

---

## Requisitos

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

---

## Ejemplo de Ejecución

```
Ingrese su año de nacimiento: 1995 

Tienes 30 años. 

Tu categoría etaria es: Adulto/a.
```

---

## Puntos Extra 🔥

Eleva tu solución incorporando alguna de estas mejoras:

- ✅ Obtener el año actual automáticamente con `LocalDate.now().getYear()`.
- ✅ Validar que el año ingresado sea razonable (mayor a 1900 y menor o igual al actual).
- ✅ Mostrar mensajes personalizados según la categoría:
  - "¡Qué joven eres!" para menores de 18
  - "¡Edad perfecta para seguir aprendiendo Java!" para entre 18 y 30
  - "¡Nunca es tarde para programar!" para mayores de 60
- ✅ Separar la lógica en métodos como `calcularEdad()` y `obtenerCategoria()` para mayor claridad.
- ✅ Implementar manejo de errores con `try-catch` y control de inputs no válidos.

---

## Bonus Avanzado 🚀

- Permitir ingresar **fecha completa (dd/mm/yyyy)** y calcular edad exacta considerando el mes y día.
- Agregar un bucle que permita calcular varias edades sin reiniciar el programa.
- Implementar mensajes en distintos idiomas (español/inglés) según preferencia del usuario.

---

## ¿Qué se evalúa?

- Lógica de programación.
- Manejo de fechas y condicionales.
- Validación de entradas.
- Uso adecuado de métodos y control de flujo.
- Legibilidad y calidad del código.

---

¿Listo para descubrir cuántos años de código tienes por delante? 🧓🧒 ¡A programar!