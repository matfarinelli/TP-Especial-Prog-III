public class Main {

    public static void main(String[] args) {

        Libro l1 = new Libro("Relatos Salvajes");

        l1.agregarAutor("Tinelli Marcelo");
        l1.agregarAutor("Codevilla Pablo");
        l1.agregarGenero("Thriller");
        l1.agregarGenero("Thriller");
        l1.agregarGenero("Comedia Negra");
        l1.agregarGenero("Suspenso");

        System.out.println(l1.getAutores());
        System.out.println(l1.getGeneros());


        l1.quitarAutor("pepe");
        l1.quitarAutor("Tinelli Marcelo");
        System.out.println(l1.getAutores());
        l1.quitarAutor("codevilla");
        System.out.println(l1.getAutores());

        l1.agregarGenero("terror");
        l1.agregarGenero("Comedia negra");
        l1.agregarGenero("terror");
        System.out.println(l1.getGeneros());

        l1.isAutor("tinelli marcelo");

    }
}
