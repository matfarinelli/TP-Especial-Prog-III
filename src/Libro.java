import java.util.ArrayList;

public class Libro {

    private String titulo;
    private String autor;
    private String cantidadPaginas; // ver. El split divide strings
    private ArrayList<String> generos;

    public Libro(String titulo) {
        this.titulo = titulo.toUpperCase();
        this.generos = new ArrayList<String>();
    }

    public Libro(String titulo, String autor, String cantidadPaginas) {
        this.titulo = titulo.toUpperCase();
        this.cantidadPaginas = cantidadPaginas;
        this.autor = autor;
        this.generos = new ArrayList<String>();
    }

    public Libro(String titulo, String autor, String cantidadPaginas, String genero) {
        this.titulo = titulo.toUpperCase();
        this.autor = autor;
        this.autor = autor;
        this.cantidadPaginas = cantidadPaginas;
        this.generos = new ArrayList<String>();
        generos.add(genero);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantidadPaginas(String cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void agregarGenero(String genero) {
        if (!this.generos.contains(genero.toUpperCase())) {
            this.generos.add(genero.toUpperCase());
        }
    }

    public void quitarGenero(String genero) {
        this.generos.remove(genero.toUpperCase());
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutores() {
        return this.autor;
    }

    public String getCantidadPaginas() {
        return this.cantidadPaginas;
    }

    public ArrayList<String> getGeneros() {
        return new ArrayList<>(this.generos);
    }

    public String toString() {
        return "Nombre : " + this.getTitulo() + " - Autor : " + this.autor;
    }
}