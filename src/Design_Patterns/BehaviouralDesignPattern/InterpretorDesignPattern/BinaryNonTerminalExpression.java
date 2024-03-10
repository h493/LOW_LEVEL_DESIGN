package Design_Patterns.BehaviouralDesignPattern.InterpretorDesignPattern;

public class BinaryNonTerminalExpression implements AbstractExpression{

    AbstractExpression leftExpression;
    AbstractExpression rightExpression;
    char operator;

    public BinaryNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression, char operator){
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }
    @Override
    public int interpret(Context context) {
        switch (operator){
            case '*':
                return leftExpression.interpret(context) * rightExpression.interpret(context);
            case '+':
                return leftExpression.interpret(context) + rightExpression.interpret(context);
            default:
                return 0;
        }
    }
}
