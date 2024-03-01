package Design_Patterns.FactoryDesignPattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(Constants.CIRCLE);
    }
}
