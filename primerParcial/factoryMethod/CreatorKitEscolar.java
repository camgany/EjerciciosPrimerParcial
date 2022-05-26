package primerParcial.factoryMethod;

public class CreatorKitEscolar extends Creator{
    @Override
    public KitEscolar createProduct() {
        Mochila m1 = new Mochila();
        m1.setTamano("34 x 45 cm");
        m1.setNumeroBolsillos(5);

        Deportivo d1 = new Deportivo();
        d1.setColor("Azul Marino");
        d1.setNumeroPrendas(4);
        d1.setTalla("M");

        Cuadernos c1 = new Cuadernos();
        c1.setTipo("Carta");
        c1.setNumeroHojas(500);

        KitEscolar kit = new KitEscolar(m1,d1,c1);
        return kit;
    }
}
