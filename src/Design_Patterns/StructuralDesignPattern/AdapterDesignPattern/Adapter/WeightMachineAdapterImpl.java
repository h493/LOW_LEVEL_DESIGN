package Design_Patterns.StructuralDesignPattern.AdapterDesignPattern.Adapter;

import Design_Patterns.StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdaptor{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPound();

        //ConvertToKg
        double weightInKg = weightInPound * 0.45;
        return weightInKg;
    }
}
