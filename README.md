# Ejercios Programación Funcional

Los siguentes ejercicios se encuentran numerados de la misma forma en el directorio Main:

1. Desarrolla una clase mutable y una inmutable.

2. Crea un algoritmo que devuelva la potencia de un número dado, usando la clase function.

3. De acuerdo con el punto anterior, valida si la respuesta del resultado es par o impar (Predicate).

4. Actividad Mis Libros:
  - Crea una clase llamada “libros”, que contenga nombre, autor, puntaje.

  - Usa un supplier para crear una lista de libros. (Más de 3, por lo menos).

  - Crea un consumer que reciba una lista de libros para hacer lo siguiente:

    - Crea un predicate que determine si los libros son recomendados cuando el libro tiene un puntaje mayor o igual a 7.

    - Usando UnaryOperator, muestra por consola el mensaje “El libro <tal libro> es recomendado ”.

5. Usando BinaryOperator, dados dos BigDecimal, retorna un BigDecimal con el resultado de una división.

6. Usando una interface SAM, crea una función que reciba el nombre, la edad de una persona y la fecha de nacimiento, y devuelva el siguiente mensaje: “La fecha de nacimiento de <nombre> corresponde/no corresponde a la edad ingresada”. Dentro del proceso usa una BiFunction para validar si la edad ingresada coincide con la edad ingresada.

7. Dada una lista de fechas, crea un método usando un operador de referencia (Operator :: ) que permita mostrar el siguiente mensaje por consola “La fecha es <día> de <mes> del <año>.

8. Usando chaining, crea una calculadora que permita sumar, restar y multiplicar, que admita un llamado en cadena, y que por cada llamado vaya mostrando el acumulado.

9. Usa Optional Streams, ForEeach y Filter para:

  - Crear una lista que contenga una lista de nombres.

  - Crear un método o una función que, recibiendo un parámetro, recorra la lista creada en el paso anterior y devuelva otra lista con los elementos que coincidan exactamente con el parámetro recibido.

  - Usando Optional, crear una función o un método que imprima los elementos de la nueva lista filtrada en el punto anterior.
