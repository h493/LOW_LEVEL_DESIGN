package Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern;

import Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern.BasePizza.BasePizza;
import Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern.BasePizza.Margarita;
import Design_Patterns.StructuralDesignPattern.DecoratorDesignPattern.Topping.ExtraChesse;

public class Dominos {

    public static void main(String[] args) {
        BasePizza margariate = new Margarita();

        BasePizza extraCheeseMargarita = new ExtraChesse(margariate);

        System.out.println(extraCheeseMargarita.cost());
    }
}
