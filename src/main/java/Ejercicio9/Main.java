package Ejercicio9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("*** Función Encontrar Nombres *** ");
        System.out.println("--------------------------------");
        //
        System.out.println("--------------------------------");
        List<String> nombres = crearListaNombres();
        List<String> nombresFiltrados = filtrarNombresPorParametro(nombres, "Ana");
        imprimirNombresFiltrados(nombresFiltrados);
        System.out.println("\n--------------------------------\n");

    }

    private static List<String> crearListaNombres() {
        return Arrays.asList("Ana", "Pedro", "Juan", "Maria", "Carlos", "Ana", "Miguel", "Ana", "Fernando");
    }

    private static List<String> filtrarNombresPorParametro(List<String> nombres, String parametro) {
        return nombres.stream()
                .filter(nombre -> nombre.equals(parametro))
                .collect(Collectors.toList());
    }

    private static void imprimirNombresFiltrados(List<String> nombresFiltrados) {
        Optional.ofNullable(nombresFiltrados)
                .filter(lista -> !lista.isEmpty())
                .ifPresent(
                        lista -> lista.forEach(nombre -> System.out.println("Nombre encontrado: " + nombre))
                );
    }

}
