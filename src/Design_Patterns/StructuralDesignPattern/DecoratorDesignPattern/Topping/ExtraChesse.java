package Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern.Topping;

import Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern.BasePizza.BasePizza;

public class ExtraChesse extends Toppings {

    BasePizza basePizza;

    public ExtraChesse(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
