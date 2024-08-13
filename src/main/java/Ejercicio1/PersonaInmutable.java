package Ejercicio1;

public final class PersonaInmutable {
    private final String nombre;
    private final int edad;

    public PersonaInmutable(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public PersonaInmutable setNombre(String nombre) {
        return new PersonaInmutable(nombre, this.edad);
    }

    public PersonaInmutable setEdad(int edad) {
        return new PersonaInmutable(this.nombre, edad);
    }

    @Override
    public String toString() {
        return "PersonaInmutable {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
