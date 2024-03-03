package Design_Patterns.CreationalDesignPattern.AbstractDesignPattern;

public class EconomicCarFactory implements AbstractFactory{
    @Override
    public Car getCarInstance(int price) {
        if(price < 10000) return new EconomicCar1();
        else if(price >= 10000) return new EconomicCar2();
        return null;
    }
}
