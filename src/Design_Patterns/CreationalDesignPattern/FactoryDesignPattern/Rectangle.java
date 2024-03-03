package Design_Patterns.CreationalDesignPattern.FactoryDesignPattern;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println(Constants.RECTANGLE);
    }
}
