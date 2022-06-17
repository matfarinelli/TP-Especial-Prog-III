import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Genero> generos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public void cargarBiblioteca(String csv) {
        CSVReader reader = new CSVReader(csv);
        reader.cargarBiblioteca(this);
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
                this.addGenero(nuevoGenero);
                nuevoGenero.addLibro(libro);
            }

            // podria controlar que no esté repetido
            this.libros.add(libro);
        }

    }

    // DEBERÍA HACERLO DE MANERA ORDENADA PARA MEJORAR TIEMPOS DE BÚSQUEDA
    public void addGenero(Genero genero) {
        if (generos.isEmpty()) {
            generos.add(genero);
        } else {
            if (!generos.contains(genero)) {
                int posicion = 0;

                // 0 es igual - 1 es mayor y -1 es menor
                while (posicion < generos.size() && (generos.get(posicion).compareTo(genero.toString()) < 0)) {
                    posicion++;
                }

                if (posicion == generos.size()) {
                    generos.add(genero);
                }

                generos.add(posicion, genero);

            }
        }

        this.generos.add(genero);
    }

    // libros de la biblioteca
    public ArrayList<Libro> getLibros() {
        return new ArrayList<>(this.libros);
    }

    // generos de la biblioteca
    public ArrayList<Genero> getGeneros() {
        return new ArrayList<>(this.generos);
    }

    // llamo al indice del genero
    // public String getLibroPorGenero(String genero) {
    public ArrayList<Libro> getLibroPorGenero(String genero) {
        Genero generoBuscado = new Genero(genero);

        for (Genero generoBiblioteca : this.generos) {

            if (generoBiblioteca.equals(generoBuscado)) {
                // System.out.println(generoBiblioteca.getLibros().toString());
                // return generoBiblioteca.getLibros().toString();
                return new ArrayList<>(generoBiblioteca.getLibros());
            } // else
              // System.out.println("no tenemos el genero buscado");
        }

        return new ArrayList<Libro>();

    }

}
