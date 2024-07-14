package Design_Patterns.StructuralDesignPattern.BridgeDesignPattern;

import Design_Patterns.StructuralDesignPattern.BridgeDesignPattern.Breathe.BreatheImplementor;

public class Tree extends LivingThings{
    Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breatheProcess() {
        breatheImplementor.breatheProcess();
    }
}
