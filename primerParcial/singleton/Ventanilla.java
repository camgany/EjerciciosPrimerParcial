package primerParcial.singleton;


public class Ventanilla {
        private static  Ventanilla ventanilla;
    private Cajero cajero = new Cajero();
    private int saldo=0;


    private Ventanilla(){
            saldo=0;
            System.out.println("Inicial Saldo: "+saldo);
        cajero.setCodigo(7657658);

        }


    private synchronized static void  multiThreadControl(){
            if (ventanilla== null) {
                ventanilla = new Ventanilla();
            }
        }


        public static Ventanilla getInstance(){
            if (ventanilla==null)
                multiThreadControl();

            return ventanilla;
        }

        public synchronized void pagar(int cantidad){
                System.out.println("------------------------------------------------------------------------------------");
                saldo=saldo+cantidad;
                System.out.println("Cantidad a pagar: "+cantidad + "Bs");
                mostrarSaldo();

        }

        public synchronized void mostrarSaldo(){

            System.out.println("Saldo total en ventanilla: "+saldo+"Bs");
            System.out.println("Cajero: "+cajero.getCodigo());
            System.out.println("------------------------------------------------------------------------------------");
        }

}
