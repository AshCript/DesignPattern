package mg.as.dp.cr.factoryMethod.Pizza.store;

import mg.as.dp.cr.factoryMethod.Pizza.pizza.Pizza;

public abstract class PizzaStore {
  public static final int PEPPERONI = 1;
  public static final int CHEESE = 2;
  public Pizza orderPizza(int type){
    Pizza pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  protected abstract Pizza createPizza(int type);
  
}
