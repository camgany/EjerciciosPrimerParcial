package primerParcial.builder;

public class Parrilla {
    private String tipoCarne;
    private String saborRefresco;
    private String guarnicion;

    public Parrilla(){}

    public String getTipoCarne() {
        return tipoCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public String getGuarnicion() {
        return guarnicion;
    }

    public Parrilla setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    public Parrilla setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
        return this;
    }

    public Parrilla setGuarnicion(String guarnicion) {
        this.guarnicion = guarnicion;
        return this;
    }
    public void showInfo() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Tipo de Carne: "+tipoCarne);
        System.out.println("Sabor de Refresco: "+saborRefresco);
        System.out.println("Guarniciones: "+guarnicion);
        System.out.println("--------------------------------------------------------------------------");
    }
}
