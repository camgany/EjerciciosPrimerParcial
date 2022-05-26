package primerParcial.factoryMethod;

public class KitColegial implements IKit{
    private Mochila mochila;
    private Libros libros;
    private Computadora computadora;

    public KitColegial(Mochila mochila, Libros libros, Computadora computadora){
        this.computadora = computadora;
        this.libros = libros;
        this.mochila = mochila;
    }
    @Override
    public void showInfo() {

        System.out.println("--------------------------KIT COLEGIAL--------------------------");
        System.out.println("Mochila: ");
        System.out.println("  - Numero de Bolsillos: "+mochila.getNumeroBolsillos());
        System.out.println("  - Tamano: "+mochila.getTamano());
        System.out.println("Libro: ");
        System.out.println("  - Tipo: "+libros.getTipo());
        System.out.println("  - Autor: "+libros.getAutor());
        System.out.println("Computadora:");
        System.out.println("  - Marca: "+computadora.getMarca());
        System.out.println("  - OS: "+computadora.getSistemaOperativo());
        System.out.println("----------------------------------------------------------------");


    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
