package Design_Patterns.StructuralDesignPattern.BridgeDesignPattern;

import Design_Patterns.StructuralDesignPattern.BridgeDesignPattern.Breathe.BreatheImplementor;

public class Fish extends LivingThings{
    Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
