package Ejercicio4;

class Libro {
    private String nombre;
    private String autor;
    private int puntaje;

    public Libro(String nombre, String autor, int puntaje) {
        this.nombre = nombre;
        this.autor = autor;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", puntaje=" + puntaje +
                '}';
    }
}
