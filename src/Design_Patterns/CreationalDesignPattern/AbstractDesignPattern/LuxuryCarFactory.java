package Design_Patterns.CreationalDesignPattern.AbstractDesignPattern;

public class LuxuryCarFactory implements AbstractFactory{
    @Override
    public Car getCarInstance(int price) {
        if(price < 400000) return new LuxuryCar1();
        else if(price > 400000) return new LuxuryCar2();
        return null;
    }
}
