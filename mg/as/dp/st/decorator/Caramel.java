package mg.as.dp.st.decorator;

public class Caramel extends BoissonDecorator{


  public Caramel(Boisson boisson) {
    super(boisson);
  }

  @Override
  public String getDescription() {
    return boisson.getDescription() + " au caramel";
  }

  @Override
  public double cout() {
    return boisson.cout() + 1.5;
  }
  
}
