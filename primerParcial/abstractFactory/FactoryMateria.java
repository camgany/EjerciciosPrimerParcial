package primerParcial.abstractFactory;

public class FactoryMateria {
    public static IMateria make(MateriaType pasajeType){
        IMateria materia;
        switch (pasajeType){
            case MATEMATICA:
                materia=new Matematica();
                ((Matematica) materia).setNumeroTemas(3);
                ((Matematica) materia).setCantidadEvaluaciones("10");
                materia.showInfo();
                break;
            case LENGUAJE:
                materia=new Lenguaje();
                ((Lenguaje) materia).setNumeroTemas(2);
                ((Lenguaje) materia).setCantidadEvaluaciones("11");
                materia.showInfo();
                break;
            case HISTORIA:
                materia=new Historia();
                ((Historia) materia).setNumeroTemas(5);
                ((Historia) materia).setCantidadEvaluaciones("9");
                materia.showInfo();
                break;
            case INGLES:
                materia=new Ingles();
                ((Ingles) materia).setCantidadEvaluaciones("1");
                ((Ingles) materia).setNumeroTemas(2);
                materia.showInfo();
                break;
            default:
                materia=new Ingles();
                ((Ingles) materia).setCantidadEvaluaciones("1");
                ((Ingles) materia).setNumeroTemas(2);
                materia.showInfo();
                break;
        }

        return materia;
    }

}
