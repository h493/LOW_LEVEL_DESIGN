package Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern.Topping;

import Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern.BasePizza.BasePizza;

public class Mushroom extends Toppings{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 60;
    }
}
