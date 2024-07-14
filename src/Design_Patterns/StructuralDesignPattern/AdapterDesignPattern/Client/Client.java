package Design_Patterns.StructuralDesignPattern.AdapterDesignPattern.Client;

import Design_Patterns.StructuralDesignPattern.AdapterDesignPattern.Adaptee.WeightMachineForBabies;
import Design_Patterns.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;
import Design_Patterns.StructuralDesignPattern.AdapterDesignPattern.Adapter.WeightMachineAdaptor;

public class Client {

    public static void main(String[] args) {
        WeightMachineAdaptor weightMachineAdaptor  = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdaptor.getWeightInKg());
    }
}
