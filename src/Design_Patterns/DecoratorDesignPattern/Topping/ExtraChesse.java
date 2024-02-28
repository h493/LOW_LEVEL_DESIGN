package Design_Patterns.DecoratorDesignPattern.Topping;

import Design_Patterns.DecoratorDesignPattern.BasePizza.BasePizza;

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
