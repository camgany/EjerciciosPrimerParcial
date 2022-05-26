package primerParcial.interpreter;

import java.util.ArrayList;
import java.util.List;

public class NonTerminalExpression extends AbstractExpression{
    private List<AbstractExpression> grammar = new ArrayList<>();
    private Context context;
    public NonTerminalExpression(String msgToInterpreter){
        // asegurando que el msg original no tenga espacios - regla gramatica
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "Como":
                    grammar.add(new TerminalExpressionComo());
                    break;
                case "Quiero":
                    grammar.add(new TerminalExpressionQuiero());
                    break;
                case "Para":
                    grammar.add(new TerminalExpressionPara());
                    break;
                default:
                    grammar.add(new TerminalExpressionNormal());
                    break;


            }
        }
    }

    public String evaluateMsg(){

        for (AbstractExpression expression:grammar) {
            expression.interpreter(context);
        }

        return context.output;
    }

    @Override
    public void interpreter(Context context) {

    }
}
