package mg.as.dp.st.decorator;

public class Espresso extends Boisson{
  
  public Espresso() {
    description = "Espresso";
  }

  @Override
  public double cout() {
    return 5.0;
  }
  
}
