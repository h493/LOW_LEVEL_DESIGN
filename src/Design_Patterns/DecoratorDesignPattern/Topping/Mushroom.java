package Design_Patterns.DecoratorDesignPattern.Topping;

import Design_Patterns.DecoratorDesignPattern.BasePizza.BasePizza;

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
