import java.util.ArrayList;
import timer.Timer;

public class Biblioteca {

    private ArrayList<Libro> libros;
    private ArrayList<Genero> generos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.generos = new ArrayList<>();
    }

    public void cargarBiblioteca(String csv) {

        Timer timer = new Timer();
        System.out.println("Carga de biblioteca: ");
        timer.start();

        CSVReader reader = new CSVReader(csv);
        reader.cargarBiblioteca(this);

        System.out.println(timer.stop());
    }

    public void addLibro(Libro libro) { // O(n^2)
        // generos del nuevo libro
        ArrayList<String> generosLibro = libro.getGeneros();

        for (String generoLibro : generosLibro) { // O(n)
            // obtengo el primer genero y lo voy comparando con los generos de la biblioteca
            Boolean esta = false;

            for (Genero generoBiblioteca : this.generos) { // O(n)

                if (generoBiblioteca.getNombre().equals(generoLibro)) {
                    // al indice
                    generoBiblioteca.addLibro(libro); // O(1)
                    esta = true;
                }
            }

            // si no esta el genero, agregarlo a biblioteca
            // y agregar el libro a su organizador en "generos"
            if (!esta) {
                Genero nuevoGenero = new Genero(generoLibro);
                this.addGenero(nuevoGenero);
                // metodo que inserta genero ordenado a la biblioteca
                nuevoGenero.addLibro(libro);
            }

        }

        this.libros.add(libro);
    }

    public void addGenero(Genero genero) { // O(n^2)
        if (this.generos.isEmpty()) {
            this.generos.add(genero);
        } else {
            if (!generos.contains(genero)) { // O(n)
                int posicion = 0;

                // 0 es igual - 1 es mayor y -1 es menor
                while (posicion < generos.size() && (generos.get(posicion).compareTo(genero.toString()) < 0)) {
                    posicion++;
                }

                if (posicion == generos.size()) {
                    // agrego al final
                    generos.add(genero);
                } else {
                    this.generos.add(posicion, genero);
                }

            }
        }

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
    public ArrayList<Libro> getLibrosPorGenero(String genero) {
        Genero generoBuscado = new Genero(genero);

        Timer timer = new Timer();
        timer.start();

        for (Genero generoBiblioteca : this.generos) {

            if (generoBiblioteca.equals(generoBuscado)) {
                System.out.println(timer.stop());
                return new ArrayList<>(generoBiblioteca.getLibros());
            } // else
              // System.out.println("no tenemos el genero buscado");
        }

        System.out.println("Busqueda por índice en biblioteca: ");
        System.out.println(timer.stop());
        return new ArrayList<Libro>();

    }

}
