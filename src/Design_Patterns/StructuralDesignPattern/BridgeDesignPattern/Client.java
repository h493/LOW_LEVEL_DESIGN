package Design_Patterns.StructuralDesignPattern.BridgeDesignPattern;

import Design_Patterns.StructuralDesignPattern.BridgeDesignPattern.Breathe.LandBreathe;

public class Client {
    public static void main(String[] args) {
        LivingThings livingThings = new Dog(new LandBreathe());
        livingThings.breatheProcess();
    }
}
