package Design_Patterns.BehaviouralDesignPattern.InterpretorDesignPattern;

public class Client {

    public static void main(String[] args) {

        // Initialise the context
        Context context = new Context();
        context.put("a", 2);
        context.put("b", 4);
        context.put("c", 10);
        context.put("d", 100);

        //(a*b)
        AbstractExpression expression1 = new BinaryNonTerminalExpression(
                new NumberTerminalExpression("c"), new NumberTerminalExpression("b"), '*'
        );

        //((a*b) + (c*d))
        AbstractExpression expression2 = new BinaryNonTerminalExpression(
                new BinaryNonTerminalExpression(
                        new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '*'
                ), new BinaryNonTerminalExpression(
                        new NumberTerminalExpression("c"), new NumberTerminalExpression("d"), '*'
        ), '+'
        );

        System.out.println(expression2.interpret(context));
        System.out.println(expression1.interpret(context));

    }
}
