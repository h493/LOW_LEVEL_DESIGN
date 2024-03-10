package Design_Patterns.BehaviouralDesignPattern.InterpretorDesignPattern;

public class NumberTerminalExpression implements AbstractExpression{

    String strValue;

    public NumberTerminalExpression(String strValue){
        this.strValue = strValue;
    }
    @Override
    public int interpret(Context context) {
        return context.get(strValue);
    }
}
