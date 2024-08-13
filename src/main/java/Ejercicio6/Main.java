package Ejercicio6;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        // BiFunction para validar si la edad coincide con la fecha de nacimiento
        BiFunction<LocalDate, Integer, Boolean> validarEdad = (fechaNacimiento, edadIngresada) -> {
            int edadReal = Period.between(fechaNacimiento, LocalDate.now()).getYears();
            return edadReal == edadIngresada;
        };

        // Implementación de la interfaz SAM
        ValidadorPersona validador = (nombre, edadIngresada, fechaNacimiento) -> {
            boolean edadCorrecta = validarEdad.apply(fechaNacimiento, edadIngresada);
            return "La fecha de nacimiento de " + nombre + " " +
                    (edadCorrecta ? "corresponde" : "no corresponde") +
                    " a la edad ingresada.";
        };

        System.out.println("--------------------------------");
        System.out.println("*** Función Validacion de fechas *** ");
        System.out.println("--------------------------------");
        //
        System.out.println("--------------------------------");
        System.out.println(validador.validar("Juan", 30, LocalDate.of(1993, 5, 15)));
        System.out.println("\n--------------------------------\n");
        System.out.println("--------------------------------");
        System.out.println(validador.validar("María", 25, LocalDate.of(1995, 8, 20)));
        System.out.println("\n--------------------------------\n");
        System.out.println("--------------------------------");
        System.out.println(validador.validar("Pedro", 40, LocalDate.of(1983, 12, 1)));
        System.out.println("\n--------------------------------\n");

    }
}

@FunctionalInterface
interface ValidadorPersona {
    String validar(String nombre, int edadIngresada, LocalDate fechaNacimiento);
}