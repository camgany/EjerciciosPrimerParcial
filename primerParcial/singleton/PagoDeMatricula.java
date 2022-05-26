package primerParcial.singleton;

public class PagoDeMatricula {
    private Cajero cajero;
    private Estudiante estudiante;


    public PagoDeMatricula(Estudiante estudiante){
        this.estudiante=estudiante;
    }
    public void pagar(int cantidad){
        Ventanilla.getInstance().pagar(cantidad);
    }
    public void mostrarDinero(){
        Ventanilla.getInstance().mostrarSaldo();
    }
}
