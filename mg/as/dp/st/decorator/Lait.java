package mg.as.dp.st.decorator;

public class Lait extends BoissonDecorator{

  public Lait(Boisson boisson) {
    super(boisson);
  }

  @Override
  public String getDescription() {
    return boisson.getDescription() + " au lait";
  }

  @Override
  public double cout() {
    return boisson.cout() + 3;
  }
  
}
