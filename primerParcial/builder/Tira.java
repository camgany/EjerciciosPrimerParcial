package primerParcial.builder;

public class Tira extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoCarne("tira de carne");
    }

    @Override
    public void buildsaborRefresco() {
        this.parrilla.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildguarnicion() {
        this.parrilla.setGuarnicion("Fideo");
    }
}
