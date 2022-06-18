import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Biblioteca b1 = new Biblioteca();
        // Libro l1 = new Libro("Relatos Salvajes");

        // // // // pruebas
        // l1.setAutor("Tinelli Marcelo");

        // l1.agregarGenero("Thriller");
        // l1.agregarGenero("ThrIller");
        // l1.agregarGenero("Comedia Negra");
        // l1.agregarGenero("Suspenso");

        // // // // System.out.println(l1.getAutores());

        // Libro l2 = new Libro("Harry Potter");

        // l2.agregarGenero("Suspenso");
        // l2.agregarGenero("Infantil");
        // // l2.agregarGenero("Thriller");

        // b1.addLibro(l1);
        // b1.addLibro(l2);

        // System.out.println(b1.getGeneros().toString());

        // System.out.println(b1.getLibroPorGenero("ThrIller"));

        // CSVReader csvR = new CSVReader("./dataset4.csv");

        Biblioteca b1 = new Biblioteca();

        b1.cargarBiblioteca("./dataset1.csv");

        // System.out.println(b1.getGeneros());
        // System.out.println(" -------------- ");
        // System.out.println(b1.getLibros());

        // System.out.println(b1.getLibroPorGenero("terror"));

        // ArrayList<Libro> busqueda = b1.getLibroPorGenero("cultura");

        Libro test = new Libro("Relatos Salvajes");
        test.setAutor("Scolpe");
        test.agregarGenero("poesía");

        b1.addLibro(test);

        CSVWritter csvW = new CSVWritter(b1.getLibroPorGenero("poesía"));

        csvW.generarArchivoCSV();

        //System.out.println(b1.getLibroPorGenero("poesía"));

        //System.out.println(b1.getLibros());
    }

}
