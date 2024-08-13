package Ejercicio7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        // Operador de referencia para el método procesarFecha
        Consumer<LocalDate> procesador = Main::procesarFecha;

        System.out.println("--------------------------------");
        System.out.println("*** Función Procesar fechas *** ");
        System.out.println("--------------------------------");
        //
        List<LocalDate> fechas = Arrays.asList(
                LocalDate.of(2023, 1, 15),
                LocalDate.of(2024, 5, 20),
                LocalDate.of(2022, 12, 31),
                LocalDate.of(2025, 7, 4)
        );
        fechas.forEach(procesador);

    }

    // Método estático para procesar una fecha
    public static void procesarFecha(LocalDate fecha) {
        System.out.println("--------------------------------");
        DateTimeFormatter formateadorDiaMes = DateTimeFormatter.ofPattern("d 'de' MMMM");
        String diaYMes = fecha.format(formateadorDiaMes);
        int año = fecha.getYear();
        System.out.printf("La fecha es %s del %d.%n", diaYMes, año);
        System.out.println("\n--------------------------------\n");
    }

}
