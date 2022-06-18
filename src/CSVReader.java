import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    String csvFile = "";
    String line = "";
    String cvsSplitBy = ",";

    public CSVReader(String csvFile) {
        this.csvFile = csvFile;
    }

    public void cargarBiblioteca(Biblioteca biblioteca) {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            // br.readLine();

            while ((line = br.readLine()) != null) {
                // fraccionado del csv
                String[] items = line.split(cvsSplitBy);
                String genero = items[3];
                String[] generos = genero.split(" ");

                // libro(titulo,autor,paginas)
                Libro libro = new Libro(items[0], items[1], items[2]);

                // recorrido de cada genero del libro
                for (String generoLibro : generos) {
                    // para omitir primera linea - titulos de csv
                    if (generoLibro.equals("Generos")) {
                        continue;
                    }
                    libro.agregarGenero(generoLibro);
                }

                biblioteca.addLibro(libro);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
