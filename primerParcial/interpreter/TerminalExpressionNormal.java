package primerParcial.interpreter;

public class TerminalExpressionNormal extends AbstractExpression{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(context.toString())){
            context.output= context.output+context.toString();
            context.input= context.input.substring(1);
        }
    }
}
