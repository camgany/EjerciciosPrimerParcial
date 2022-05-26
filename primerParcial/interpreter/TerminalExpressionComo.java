package primerParcial.interpreter;

public class TerminalExpressionComo extends AbstractExpression{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")){
            context.output= context.output+"Given";
            context.input= context.input.substring(1);
        }
    }
}
