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
        if (!libros.contains(libro)) {
            this.libros.add(libro);
        }

    }

    public ArrayList<Libro> getLibros() {
        return new ArrayList<>(this.libros);
    }

    public String toString() {
        // return "Genero : " + this.getNombre();
        return this.getNombre();
    }

    @Override
    public boolean equals(Object o) {
        try {
            Genero aux = (Genero) o;
            return this.getNombre().equals(aux.getNombre().toString());
        } catch (Exception e) {
            return false;
        }
    }

    public int compareTo(String generoComparativo) {
        return this.getNombre().compareTo(generoComparativo);
    }

}
