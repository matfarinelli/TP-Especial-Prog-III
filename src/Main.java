public class Main {

    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca();
        Libro l1 = new Libro("Relatos Salvajes");

        // pruebas
        // l1.setAutor("Tinelli Marcelo");

        l1.agregarGenero("Thriller");
        l1.agregarGenero("ThrIller");
        l1.agregarGenero("Comedia Negra");
        l1.agregarGenero("Suspenso");

        // System.out.println(l1.getAutores());

        Libro l2 = new Libro("Harry Potter");

        l2.agregarGenero("Suspenso");
        l2.agregarGenero("Infantil");

        b1.addLibro(l1);
        b1.addLibro(l2);

        System.out.println(b1.getGeneros().toString());

        System.out.println(b1.getLibroPorGenero("ThrIller"));



    }
}
