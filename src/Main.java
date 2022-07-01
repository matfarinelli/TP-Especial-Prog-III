
public class Main {

    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca();

        System.out.println("Humor dataset 1: ");
        b1.cargarBiblioteca("./dataset1.csv");
        CSVWritter csvW = new CSVWritter(b1.getLibrosPorGenero("humor"));
        csvW.generarArchivoCSV();

        // System.out.println("Humor dataset 2: ");
        // b1.cargarBiblioteca("./dataset2.csv");
        // CSVWritter csvW1 = new CSVWritter(b1.getLibrosPorGenero("humor"));
        // csvW1.generarArchivoCSV();

        // System.out.println("Humor dataset 3: ");
        // b1.cargarBiblioteca("./dataset3.csv");
        // CSVWritter csvW2 = new CSVWritter(b1.getLibrosPorGenero("humor"));
        // csvW2.generarArchivoCSV();

        // System.out.println("Humor dataset 4: ");
        // b1.cargarBiblioteca("./dataset4.csv");
        // CSVWritter csvW3 = new CSVWritter(b1.getLibrosPorGenero("humor"));
        // csvW3.generarArchivoCSV();


    }

}
