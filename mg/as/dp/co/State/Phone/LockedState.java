package mg.as.dp.co.State.Phone;

public class LockedState extends State{
  public LockedState(Phone phone){
    super(phone);
    System.out.println("CURRENT STATE : LOCKED\n");
  }

  public void onHome(){
    System.out.println("Switching to READY STATE");
    phone.setState(new ReadyState(phone));
  }
  
  public void onOffOn(){
    System.out.println("Switching to OFF STATE");
    phone.setState(new OffState(phone));
  }
}