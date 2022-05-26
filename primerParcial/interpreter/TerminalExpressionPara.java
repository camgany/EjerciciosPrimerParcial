package primerParcial.interpreter;

public class TerminalExpressionPara extends AbstractExpression{


    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")){
            context.output= context.output+"When";
            context.input= context.input.substring(1);
        }
    }
}
