package mg.as.dp.cr.factoryMethod.Burger;

public class BeefBurger implements Burger{
  @Override
  public void prepare() {
    System.out.println("Préparation de BeefBurger...");
  }
}
