package primerParcial.builder;


public class Restaurant {
    private BuilderParrilla builder;
    public Parrilla getParrillaHecha(){
        return builder.getProduct();
    }
    public void setBuilder(BuilderParrilla builder) {
        this.builder = builder;
    }

    public void hacerParrilla(){
        this.builder.createParrilla();
        this.builder.buildTipoCarne();
        this.builder.buildguarnicion();
        this.builder.buildsaborRefresco();

    }
}
