package Ejercicio1;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("*** Clases Mutables e Inmutables *** ");
        System.out.println("--------------------------------");
        // Ejemplo con la clase mutable
        System.out.println("Persona Mutable:");
        PersonaMutable personaMutable = new PersonaMutable("Juan", 30);
        System.out.println("Original: " + personaMutable);

        personaMutable.setNombre("Juan Carlos");
        personaMutable.setEdad(31);
        System.out.println("Después de modificar: " + personaMutable);

        System.out.println("\n--------------------------------\n");
        // Ejemplo con la clase inmutable
        System.out.println("Persona Inmutable:");
        PersonaInmutable personaInmutable = new PersonaInmutable("María", 25);
        System.out.println("Original: " + personaInmutable);

        PersonaInmutable personaInmutableModificada = personaInmutable.setNombre("María José")
                .setEdad(26);
        System.out.println("Nueva instancia: " + personaInmutableModificada);
        System.out.println("Original sin cambios: " + personaInmutable);
        System.out.println("--------------------------------");
    }
}


