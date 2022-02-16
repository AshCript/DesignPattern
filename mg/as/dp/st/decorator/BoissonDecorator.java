package mg.as.dp.st.decorator;

public abstract class BoissonDecorator extends Boisson {
  protected Boisson boisson;

  public BoissonDecorator(Boisson boisson) {
    this.boisson = boisson;
  }

  public abstract String getDescription();
}
