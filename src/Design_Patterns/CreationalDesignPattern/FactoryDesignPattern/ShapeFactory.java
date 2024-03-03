package Design_Patterns.CreationalDesignPattern.FactoryDesignPattern;

public class ShapeFactory {

    Shape getshape(String input){

        switch (input){

            case Constants.CIRCLE :
                return new Circle();
            case Constants.RECTANGLE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
