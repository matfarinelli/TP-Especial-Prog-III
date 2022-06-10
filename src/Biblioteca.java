import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Genero> generos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public void addLibro(Libro libro) {

        // generos del nuevo libro
        ArrayList<String> generosLibro = libro.getGeneros();

        for (String generoLibro : generosLibro) {
            // obtengo el primer genero y lo voy comparando con los generos de la biblioteca
            Boolean esta = false;

            for (Genero generoBiblioteca : this.generos) {

                if (generoBiblioteca.getNombre().equals(generoLibro)) {
                    // System.out.println("ya tenemos este genero");
                    generoBiblioteca.addLibro(libro);
                    esta = true;
                }

            }

            // si no esta el genero, agregarlo a biblioteca
            // y agregar el libro a su organizador en "generos"
            if (!esta) {
                Genero nuevoGenero = new Genero(generoLibro.toUpperCase());
                this.generos.add(nuevoGenero);
                nuevoGenero.addLibro(libro);
            }

            // podria controlar que no esté repetido
            this.libros.add(libro);
        }

    }

    public void addGenero(Genero genero) {
        this.generos.add(genero);
    }

    // generos de la biblioteca
    public ArrayList<Genero> getGeneros() {
        return new ArrayList<>(this.generos);
    }

    // llamo al indice del genero
    public ArrayList<Libro> getLibroPorGenero(String genero) {
        Genero generoBuscado = new Genero(genero);

        for (Genero generoBiblioteca : this.generos) {
            System.out.println("genero buscado" + generoBuscado + " - genero biblioteca "
                    + generoBiblioteca);
            System.out.println("genero buscado tipo " + generoBuscado.getClass() + " - genero biblioteca tipo "
                    + generoBiblioteca.getClass());

            if (generoBiblioteca.equals(generoBuscado)) {
                System.out.println("tenemos el genero buscado " + generoBiblioteca);
                System.out.println(generoBiblioteca.getLibros());
            } else
                System.out.println("no tenemos el genero buscado");
        }

        return null;

    }

}
