package mg.as.dp.cr.factoryMethod.Pizza;

import mg.as.dp.cr.factoryMethod.Pizza.pizza.Pizza;
import mg.as.dp.cr.factoryMethod.Pizza.store.NYPizzaStore;
import mg.as.dp.cr.factoryMethod.Pizza.store.PizzaStore;

public class Main {
  public static void main(String[] args) {
    PizzaStore nyPizzaStore = new NYPizzaStore();
    Pizza nyPepperoniPizza = nyPizzaStore.orderPizza(PizzaStore.PEPPERONI);
    Pizza nyCheezePizza = nyPizzaStore.orderPizza(PizzaStore.CHEESE);
  }
}