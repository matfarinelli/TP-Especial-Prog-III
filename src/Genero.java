import java.util.ArrayList;

public class Genero {

    private String nombre;
    private ArrayList<Libro> libros; // libros por genero para futuro indice

    public Genero(String nombre) {
        this.nombre = nombre.toUpperCase();
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        return new ArrayList<>(this.libros);
    }

    public String toString() {
        return "Genero : " + this.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        try {
            Genero aux = (Genero) o;
            return this.getNombre() == aux.getNombre();
        } catch (Exception e) {
            return false;
        }
    }

}
