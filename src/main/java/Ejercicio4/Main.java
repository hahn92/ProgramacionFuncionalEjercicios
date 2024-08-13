package Ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        // Supplier para crear una lista de libros
        Supplier<List<Libro>> libroSupplier = () -> {
            List<Libro> libros = new ArrayList<>();
            libros.add(new Libro("Las aventuras de Sherlock Holmes", "Sir Arthur Conan Doyle", 10));
            libros.add(new Libro("El perro de los Baskerville", "Sir Arthur Conan Doyle", 10));
            libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 8));
            libros.add(new Libro("El principito", "Antoine de Saint-Exupéry", 6));
            libros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 7));
            return libros;
        };

        // Predicate para determinar si un libro es recomendado
        Predicate<Libro> esRecomendado = libro -> libro.getPuntaje() >= 7;

        // UnaryOperator para mostrar el mensaje de recomendación
        UnaryOperator<Libro> mostrarRecomendacion = libro -> {
            System.out.println("El libro \"" + libro.getNombre() + "\" es recomendado.");
            return libro;
        };

        // Consumer que procesa la lista de libros
        Consumer<List<Libro>> procesarLibros = libros -> {
            for (Libro libro : libros) {
                if (esRecomendado.test(libro)) {
                    mostrarRecomendacion.apply(libro);
                }
            }
        };

        System.out.println("--------------------------------");
        System.out.println("*** Ejercicio de la biblioteca *** ");
        System.out.println("--------------------------------");

        // Crear la lista de libros usando el Supplier
        List<Libro> misLibros = libroSupplier.get();

        // Procesar los libros usando el Consumer
        procesarLibros.accept(misLibros);

    }

}
