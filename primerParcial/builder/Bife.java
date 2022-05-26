package primerParcial.builder;

public class Bife extends BuilderParrilla{


    @Override
    public void buildTipoCarne() {
        this.parrilla.setTipoCarne("Bife");
    }

    @Override
    public void buildsaborRefresco() {
        this.parrilla.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildguarnicion() {
        this.parrilla.setGuarnicion("Papas Fritas");
    }
}
