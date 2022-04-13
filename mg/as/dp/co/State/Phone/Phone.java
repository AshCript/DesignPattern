package mg.as.dp.co.State.Phone;

public class Phone {
  protected State state;

  public Phone() {
    this.state = new OffState(this);
  }

  public void setState(State state) {
    this.state = state;
  }
  public void onHome(){
    state.onHome();
  }
  public void onOffOn(){
    state.onOffOn();
  }
}
