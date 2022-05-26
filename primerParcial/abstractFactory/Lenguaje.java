package primerParcial.abstractFactory;

public class Lenguaje implements IMateria{
    private int numeroTemas;
    private String cantidadEvaluaciones;

    public Lenguaje(){

    }

    public int getNumeroTemas() {
        return numeroTemas;
    }

    public void setNumeroTemas(int numeroTemas) {
        this.numeroTemas = numeroTemas;
    }

    public String getCantidadEvaluaciones() {
        return cantidadEvaluaciones;
    }

    public void setCantidadEvaluaciones(String cantidadEvaluaciones) {
        this.cantidadEvaluaciones = cantidadEvaluaciones;
    }



    @Override
    public void showInfo() {
        System.out.println("---------------------MATEMATICAS-------------------");
        System.out.println("Cantidad de Evaluaciones: " + cantidadEvaluaciones);
        System.out.println("Numero de Temas: " + numeroTemas);
    }
}
