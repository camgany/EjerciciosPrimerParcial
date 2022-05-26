package primerParcial.builder;

public abstract class BuilderParrilla {
    protected Parrilla parrilla;

    public Parrilla getProduct(){
        return parrilla;
    }

    public void createParrilla(){
        this.parrilla = new Parrilla();
    }

    public abstract void buildTipoCarne();
    public abstract void buildsaborRefresco();
    public abstract void buildguarnicion();
}
