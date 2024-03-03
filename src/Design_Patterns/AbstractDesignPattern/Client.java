package Design_Patterns.AbstractDesignPattern;

public class Client {

    public static void main(String[] args) {
        AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
        AbstractFactory abstractFactoryObj = abstractFactoryProducer.getFactoryInstance("ECONOMIC");
        Car carObj = abstractFactoryObj.getCarInstance(10000);
        System.out.println(carObj.topSpeed());
    }
}
