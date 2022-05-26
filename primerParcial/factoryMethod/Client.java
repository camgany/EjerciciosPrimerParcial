package primerParcial.factoryMethod;

public class Client {
    public static void main (String []args){
        KitColegial k1 = new CreatorKitColegial().createProduct();
        k1.showInfo();

        KitEscolar k2 = new CreatorKitEscolar().createProduct();
        k2.showInfo();
    }
}
