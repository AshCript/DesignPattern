package mg.as.dp.cr.factoryMethod.Burger.restaurant;

import mg.as.dp.cr.factoryMethod.Burger.Burger;
import mg.as.dp.cr.factoryMethod.Burger.VeggieBurger;

public class VeggieBurgerRestaurant extends BurgerRestaurant{

  @Override
  protected Burger createBurger() {
    return new VeggieBurger();
  }
}
