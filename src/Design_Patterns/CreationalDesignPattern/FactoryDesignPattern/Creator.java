package Design_Patterns.CreationalDesignPattern.FactoryDesignPattern;

public class Creator {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getshape(Constants.CIRCLE);
        shape.draw();
    }
}
