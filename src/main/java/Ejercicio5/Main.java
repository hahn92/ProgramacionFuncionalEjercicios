package Ejercicio5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        // BinaryOperator para la división de BigDecimal
        BinaryOperator<BigDecimal> dividir = (dividendo, divisor) -> {
            if (divisor.compareTo(BigDecimal.ZERO) == 0) {
                throw new ArithmeticException("División por cero no permitida");
            }
            return dividendo.divide(divisor, 10, RoundingMode.HALF_UP);
        };


        System.out.println("--------------------------------");
        System.out.println("*** Ejercicio dividisor de BigDecimal *** ");
        System.out.println("--------------------------------");
        //
        dividirBigDecimal(new BigDecimal("10"), new BigDecimal("3"), dividir);
        dividirBigDecimal(new BigDecimal("7"), new BigDecimal("2"), dividir);
        dividirBigDecimal(new BigDecimal("5"), new BigDecimal("0"), dividir);

    }

    private static void dividirBigDecimal(BigDecimal numero1, BigDecimal numero2, BinaryOperator<BigDecimal> dividir) {
        System.out.println("--------------------------------");
        try {
            BigDecimal resultado = dividir.apply(numero1, numero2);
            System.out.println(numero1 + " dividido por " + numero2 + " es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\n--------------------------------\n");
    }

}
