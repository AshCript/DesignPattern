package mg.as.dp.cr.factoryMethod.Pizza.store;

import mg.as.dp.cr.factoryMethod.Pizza.pizza.Pizza;
import mg.as.dp.cr.factoryMethod.Pizza.pizza.NY.NYStyleCheesePizza;
import mg.as.dp.cr.factoryMethod.Pizza.pizza.NY.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore{

  @Override
  protected Pizza createPizza(int type) {
    switch(type){
      case PizzaStore.PEPPERONI:
        return new NYStylePepperoniPizza();
      case PizzaStore.CHEESE:
        return new NYStyleCheesePizza();
      default: return null;
    }
  }
}
