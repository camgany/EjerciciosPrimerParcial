package primerParcial.factoryMethod;

public class KitEscolar implements IKit{

    private  Mochila mochila;
    private Deportivo deportivo;
    private Cuadernos cuadernos;

    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuadernos cuadernos){
        this.mochila = mochila;
        this.deportivo = deportivo;
        this.cuadernos = cuadernos;
    }
    @Override
    public void showInfo() {
        System.out.println("------------------------KIT ESCOLAR------------------------");
        System.out.println("Mochila: ");
        System.out.println("  - Numero de Bolsillos: "+mochila.getNumeroBolsillos());
        System.out.println("  - Tamano: "+mochila.getTamano());
        System.out.println("Deportivo:");
        System.out.println("  - Talla: "+deportivo.getTalla());
        System.out.println("  - Color: "+deportivo.getColor());
        System.out.println("  - Numero de Prendas: "+deportivo.getNumeroPrendas());
        System.out.println("Cuadernos:");
        System.out.println("  - Tipo: "+cuadernos.getTipo());
        System.out.println("  - Numero de Hojas: "+cuadernos.getNumeroHojas());
        System.out.println("-----------------------------------------------------------");
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }
}
