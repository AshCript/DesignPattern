package mg.as.dp.cr.factoryMethod.Burger.restaurant;

import mg.as.dp.cr.factoryMethod.Burger.BeefBurger;
import mg.as.dp.cr.factoryMethod.Burger.Burger;

public class BeefBurgerRestaurant extends BurgerRestaurant{

  @Override
  protected Burger createBurger() {
    return new BeefBurger();
  }
  
}
