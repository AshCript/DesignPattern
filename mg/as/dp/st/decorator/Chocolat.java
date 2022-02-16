package mg.as.dp.st.decorator;

public class Chocolat extends BoissonDecorator{

  public Chocolat(Boisson boisson) {
    super(boisson);
  }

  @Override
  public String getDescription() {
    return boisson.getDescription() + " au chocolat";
  }

  @Override
  public double cout() {
    return boisson.cout() + 3.2;
  }
}
