package Design_Patterns.StructuralDesignPattern.BridgeDesignPattern;

import Design_Patterns.StructuralDesignPattern.BridgeDesignPattern.Breathe.BreatheImplementor;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

    abstract void breatheProcess();
}
