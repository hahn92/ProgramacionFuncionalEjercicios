package Ejercicio2;

import java.util.function.Function;

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

        System.out.println("--------------------------------");
        System.out.println("*** Función Calculo de Potencias *** ");
        System.out.println("--------------------------------");
        //
        calcularPotencia(2, 3, potencia);
        calcularPotencia(5, 2, potencia);
        calcularPotencia(3, 0, potencia);
        calcularPotencia(2, -3, potencia);

    }

    private static void calcularPotencia(int base, int exponente, Function<Integer, Function<Integer, Integer>> potencia) {
        int resultado = potencia.apply(base).apply(exponente);
        System.out.println("--------------------------------");
        System.out.printf("%d elevado a %d es: %d", base, exponente, resultado);
        System.out.println("\n--------------------------------\n");
    }
}
