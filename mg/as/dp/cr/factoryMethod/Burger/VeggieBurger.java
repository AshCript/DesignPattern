package mg.as.dp.cr.factoryMethod.Burger;

public class VeggieBurger implements Burger{

  @Override
  public void prepare() {
    System.out.println("Préparation de VeggieBurger...");
  }
}
