package mg.as.dp.cr.factoryMethod.Burger;

import mg.as.dp.cr.factoryMethod.Burger.restaurant.BeefBurgerRestaurant;
import mg.as.dp.cr.factoryMethod.Burger.restaurant.BurgerRestaurant;
import mg.as.dp.cr.factoryMethod.Burger.restaurant.VeggieBurgerRestaurant;

public class Main {
  public static void main(String[] args) {
    BurgerRestaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
    BurgerRestaurant VeggieBurgerRestaurant = new VeggieBurgerRestaurant();

    beefBurgerRestaurant.orderBurger();
    VeggieBurgerRestaurant.orderBurger();
  }
}
