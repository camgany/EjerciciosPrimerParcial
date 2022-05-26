package primerParcial.prototype;

public class Client {
    public static void main(String[]args){
        Persona p1 = new Persona();
        p1.setNombre("Maria");
        p1.setApellido("Torrez");

        Persona p2 = new Persona();
        p2.setNombre("Laura");
        p2.setApellido("Bozzo");

        Persona p3 = new Persona();
        p3.setNombre("Dominik");
        p3.setApellido("Gonzales");

        Persona p4 = new Persona();
        p4.setNombre("Mario");
        p4.setApellido("Bautista");

        Persona p5 = new Persona();
        p4.setNombre("Manu");
        p4.setApellido("Rios");

        Contrato template = new Contrato();
        template.setSueldo(5000);
        template.setCargaHoraria(80);
        template.setCursoEducacionSuperior(true);
        template.setAccesoPlataforma(true);
        template.setMercadoBiometrico(false);
        template.setMercadoHoraEntrada("08:00");
        template.setMercadoHoraSalida("18:00");

        Contrato contrato1 = (Contrato) template.clone();
        contrato1.setPersona(p1);
        contrato1.showInfo();

        Contrato contrato2 = (Contrato) template.clone();
        contrato2.setPersona(p2);
        contrato2.showInfo();

        Contrato contrato3 = (Contrato) template.clone();
        contrato3.setPersona(p3);
        contrato3.showInfo();

        Contrato contrato4 = (Contrato) template.clone();
        contrato4.setPersona(p4);
        contrato4.showInfo();

        Contrato contrato5 = (Contrato) template.clone();
        contrato5.setPersona(p5);
        contrato5.showInfo();
    }
}
