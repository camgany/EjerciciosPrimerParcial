package primerParcial.builder;

public class Lomito extends BuilderParrilla{
    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoCarne("Lomo");
    }

    @Override
    public void buildsaborRefresco() {
        this.parrilla.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildguarnicion() {
        this.parrilla.setGuarnicion("Arroz");
    }
}
