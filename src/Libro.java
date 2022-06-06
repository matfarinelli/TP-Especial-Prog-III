import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Libro {

    private String titulo;
    private LinkedHashSet<String> autores;
    private int cantidadPaginas;
    private LinkedHashSet<String> generos;

    public Libro(String titulo) {
        this.titulo = titulo.toUpperCase();
        this.generos = new LinkedHashSet<String>();
        this.autores = new LinkedHashSet<String>();
    }

    public Libro(String titulo, int cantidadPaginas) {
        this.titulo = titulo.toUpperCase();
        this.cantidadPaginas = cantidadPaginas;
        this.generos = new LinkedHashSet<String>();
        this.autores = new LinkedHashSet<String>();
    }

    public Libro(String titulo, String autor, int cantidadPaginas, String genero) {
        this.titulo = titulo.toUpperCase();
        this.autores = new LinkedHashSet<String>();
        autores.add(autor.toUpperCase());
        this.cantidadPaginas = cantidadPaginas;
        this.generos = new LinkedHashSet<String>();
    }

    public void agregarGenero(String genero) {
        if (!this.generos.contains(genero)) {
            this.generos.add(genero.toUpperCase());
        }
    }

    public void quitarGenero(String genero) {
        this.generos.remove(genero);
    }

    public void agregarAutor(String autor) {
        if (!this.autores.contains(autor)) {
            this.autores.add(autor.toUpperCase());
        }
    }

    public void quitarAutor(String autor) {
        this.autores.remove(autor);
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<>(this.generos);
    }

    public ArrayList<String> getAutores() {
        return new ArrayList<>(this.autores);
    }

    public boolean isAutor(String autor){
        if (this.autores.contains(autor)){
            System.out.println("si está!");
            return true;
        }
        return false;
    }

}