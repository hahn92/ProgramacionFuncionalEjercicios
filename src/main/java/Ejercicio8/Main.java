package Ejercicio8;

import java.util.function.DoubleUnaryOperator;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("*** Función Calculadora encadenando operaciones *** ");
        System.out.println("--------------------------------");
        //
        System.out.println("--------------------------------");
        // Calculadora encadenando operaciones
        double resultadoFinal = new Main(0.0)
                .sumar(5.0)
                .multiplicar(2.0)
                .restar(3.0)
                .sumar(10.0)
                .multiplicar(2.0)
                .getResultado();

        System.out.printf("Resultado final: %.2f%n", resultadoFinal);
        System.out.println("\n--------------------------------\n");

    }

    private double acumulado;

    public Main(double valorInicial) {
        this.acumulado = valorInicial;
        System.out.printf("Valor inicial: %.2f%n", this.acumulado);
    }

    public Main sumar(double valor) {
        return aplicarOperacion(x -> x + valor, "Suma", valor);
    }

    public Main restar(double valor) {
        return aplicarOperacion(x -> x - valor, "Resta", valor);
    }

    public Main multiplicar(double valor) {
        return aplicarOperacion(x -> x * valor, "Multiplica", valor);
    }

    private Main aplicarOperacion(DoubleUnaryOperator operacion, String operacionNombre, double valor) {
        acumulado = operacion.applyAsDouble(acumulado);
        System.out.printf("%s %.2f, Resultado: %.2f%n", operacionNombre, valor, acumulado);
        return this;
    }

    public double getResultado() {
        return acumulado;
    }

}
