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

    public Biblioteca cargarBiblioteca() {

        Biblioteca biblioteca = new Biblioteca();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            //br.readLine();

            while ((line = br.readLine()) != null) {
                // fraccionado del csv
                String[] items = line.split(cvsSplitBy);
                String genero = items[3];
                String [] generos = genero.split(" ");

                //libro(titulo,autor,paginas)
                Libro libro = new Libro (items[0],items[1],items[2]);

                // recorrido de cada genero del libro
                for (String generoLibro : generos){
                    libro.agregarGenero(generoLibro);
                }

                biblioteca.addLibro(libro);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return biblioteca;
    }

}
