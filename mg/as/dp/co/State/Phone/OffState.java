package mg.as.dp.co.State.Phone;

public class OffState extends State {

  public OffState(Phone phone) {
    super(phone);
    System.out.println("CURRENT STATE : OFF\n");
  }

  @Override
  public void onHome() {
    System.out.println("Switching to LOCKED STATE");
    phone.setState(new LockedState(phone));
  }

  @Override
  public void onOffOn() {
    System.out.println("Switching to LOCKED STATE");
    phone.setState(new LockedState(phone));
  }
  
}
