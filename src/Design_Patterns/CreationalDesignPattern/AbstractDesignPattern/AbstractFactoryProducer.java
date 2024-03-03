package Design_Patterns.CreationalDesignPattern.AbstractDesignPattern;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryInstance(String value){

        if(value.equals("ECONOMIC")){
            return new EconomicCarFactory();
        }else if(value.equals("PREMIUM")){
            return new LuxuryCarFactory();
        }
        return null;
    }
}
