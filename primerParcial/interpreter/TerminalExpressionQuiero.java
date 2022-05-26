package primerParcial.interpreter;

public class TerminalExpressionQuiero extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")){
            context.output= context.output+"Then";
            context.input= context.input.substring(1);
        }
    }
}
