package primerParcial.interpreter;


public class Client {
    public static void main (String[]args){

        String msg=" Como administrador Quiero generar un reporte diario Para evaluar las ganancias";

        NonTerminalExpression parser = new NonTerminalExpression(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
