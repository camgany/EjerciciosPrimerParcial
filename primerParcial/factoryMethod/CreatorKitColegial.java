package primerParcial.factoryMethod;

public class CreatorKitColegial extends Creator{
    @Override
    public KitColegial createProduct() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos(3);
        mochila.setTamano("45 x 66 cm");

        Libros libros = new Libros();
        libros.setTipo("Novela");
        libros.setAutor("Gabriel Garcia Marquez");

        Computadora computadora = new Computadora();
        computadora.setMarca("ASUS");
        computadora.setSistemaOperativo("Windows");

        KitColegial kitColegial = new KitColegial(mochila,libros,computadora);
        return kitColegial;
    }
}
