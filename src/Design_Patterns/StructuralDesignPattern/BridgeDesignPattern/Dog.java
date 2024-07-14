package Design_Patterns.StructuralDesignPattern.BridgeDesignPattern;

import Design_Patterns.StructuralDesignPattern.BridgeDesignPattern.Breathe.BreatheImplementor;

public class Dog extends LivingThings{
    Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
