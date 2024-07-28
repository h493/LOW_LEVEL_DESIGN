package Design_Patterns.StructuralDesignPattern.CompositeDesignPattern.Solution2WithCompositeDesign;

public class Number implements ArithmeticExpression{
    int value;

    Number(int value){
        this.value = value;
    }
    @Override
    public int evaluate() {
        System.out.println("Number value is : " + value);
        return value;
    }
}
