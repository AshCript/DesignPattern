package mg.as.dp.cr.factoryMethod.Burger.restaurant;

import mg.as.dp.cr.factoryMethod.Burger.Burger;

public abstract class BurgerRestaurant {
  public Burger orderBurger(){
    Burger burger = createBurger();
    burger.prepare();

    return burger;
  }
  protected abstract Burger createBurger();
}