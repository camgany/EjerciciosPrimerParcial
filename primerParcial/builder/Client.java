package primerParcial.builder;

public class Client {
    public static void main(String[] args) {
        Restaurant saborGaucho = new Restaurant();
        BuilderParrilla bife = new Bife();
        BuilderParrilla lomo = new Lomito();
        BuilderParrilla tira = new Tira();

        saborGaucho.setBuilder(bife);
        saborGaucho.hacerParrilla();
        Parrilla parrilla1 = saborGaucho.getParrillaHecha();
        parrilla1.showInfo();

        saborGaucho.setBuilder(lomo);
        saborGaucho.hacerParrilla();
        Parrilla parrilla2 = saborGaucho.getParrillaHecha();
        parrilla2.showInfo();

        saborGaucho.setBuilder(tira);
        saborGaucho.hacerParrilla();
        Parrilla parrilla3 = saborGaucho.getParrillaHecha();
        parrilla3.showInfo();
    }
}
