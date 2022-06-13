import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVWritter {
	
	private  ArrayList<Libro> libros;
	
	public CSVWritter(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public void generarArchivoCSV() {
		BufferedWriter bw = null;
		try {
			File file = new File("./salida.csv");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// Escribo la primer linea del archivo
			String contenidoLinea1 = "Libro,Autor";
			bw.write(contenidoLinea1);
			bw.newLine();
			
			for (Libro libro : libros) {
				bw.write(libro.toString());
				bw.newLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

}