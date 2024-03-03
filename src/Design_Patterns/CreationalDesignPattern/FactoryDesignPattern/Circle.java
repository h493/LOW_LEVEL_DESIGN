package Design_Patterns.CreationalDesignPattern.FactoryDesignPattern;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(Constants.CIRCLE);
    }
}
