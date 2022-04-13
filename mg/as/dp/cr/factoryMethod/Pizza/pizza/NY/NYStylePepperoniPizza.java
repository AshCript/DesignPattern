package mg.as.dp.cr.factoryMethod.Pizza.pizza.NY;

import mg.as.dp.cr.factoryMethod.Pizza.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza{
  @Override
  public void prepare() {
    System.out.println("Preparing NY Style Pepperoni Pizza...");
    
  }

  @Override
  public void bake() {
    System.out.println("Baking NY Style Pepperoni Pizza...");
    
  }

  @Override
  public void cut() {
    System.out.println("Cutting NY Style Pepperoni Pizza...");
    
  }

  @Override
  public void box() {
    System.out.println("Boxing NY Style Pepperoni Pizza...");
    
  }
}
