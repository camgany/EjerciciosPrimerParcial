package primerParcial.singleton;


public class Client {
    public static void main(String [] args){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Jaden Hosser");
        estudiante.setCi(556879);
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Brenda Zambrano");
        estudiante2.setCi(214356);
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Laura Bozzo");
        estudiante3.setCi(123257);
        Estudiante estudiante4 = new Estudiante();
        estudiante3.setNombre("Nessa Barrent");
        estudiante3.setCi(654214);
        Estudiante estudiante5 = new Estudiante();
        estudiante3.setNombre("Justin Bieber");
        estudiante3.setCi(897896);

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoDeMatricula p1 = new PagoDeMatricula(estudiante);
                p1.pagar(100);
            }
        });


        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoDeMatricula p2 = new PagoDeMatricula(estudiante2);
                p2.pagar(50);
            }
        });

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoDeMatricula p3 = new PagoDeMatricula(estudiante3);
                p3.pagar(60);
            }
        });
        Thread hilo4 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoDeMatricula p4 = new PagoDeMatricula(estudiante4);
                p4.pagar(40);
            }
        });
        Thread hilo5 = new Thread(new Runnable() {
            @Override
            public void run() {
                PagoDeMatricula p5 = new PagoDeMatricula(estudiante5);
                p5.pagar(20);
            }
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();


    }
}
