package Ejercicio3;

import java.util.function.Function;
import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {

        // Función que calcula la potencia
        Function<Integer, Function<Integer, Integer>> potencia = base -> exponente -> {
            int resultado = 1;
            if (exponente == 0) {
                return resultado;
            }
            for (int i = 0; i < Math.abs(exponente); i++) {
                resultado *= base;
            }
            return exponente > 0 ? resultado : 1 / resultado;
        };

        // Predicado para verificar si un número es par
        Predicate<Integer> esPar = numero -> numero % 2 == 0;

        System.out.println("--------------------------------");
        System.out.println("*** Predicado Validacion de numeros pares *** ");
        System.out.println("--------------------------------");
        //
        evaluarPares(2, 3, potencia, esPar);
        evaluarPares(5, 2, potencia, esPar);
        evaluarPares(3, 0, potencia, esPar);
        evaluarPares(2, -3, potencia, esPar);
    }

    private static void evaluarPares(int base, int exponente,
                                         Function<Integer, Function<Integer, Integer>> potencia,
                                         Predicate<Integer> esPar) {
        int resultado = potencia.apply(base).apply(exponente);
        String paridad = esPar.test(resultado) ? "par" : "impar";
        System.out.println("--------------------------------");
        System.out.printf("%d elevado a %d es: %d (es %s)", base, exponente, resultado, paridad);
        System.out.println("\n--------------------------------\n");
    }

}
