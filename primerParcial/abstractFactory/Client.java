package primerParcial.abstractFactory;


public class Client {
    public static void main (String[]args){
    Estudiantes laura = new Estudiantes();
    laura.setCi(4547658);
    laura.setNombre("Laura Bozzo");
    laura.inscribirse(MateriaType.HISTORIA);

    Estudiantes jaden = new Estudiantes();
    jaden.setCi(123255);
    jaden.setNombre("Jaden Hosser");
    jaden.inscribirse(MateriaType.MATEMATICA);

    Estudiantes mario = new Estudiantes();
    mario.setCi(797809);
    mario.setNombre("Mario Bautista");
    mario.inscribirse(MateriaType.INGLES);

    Estudiantes juanpa = new Estudiantes();
    juanpa.setCi(6576533);
    juanpa.setNombre("Juan Pablo Zurita");
    juanpa.inscribirse(MateriaType.LENGUAJE);

    Estudiantes nessa = new Estudiantes();
    nessa.setCi(798700);
    nessa.setNombre("Nessa Barrent");
    nessa.inscribirse(MateriaType.LENGUAJE);
    }
}
