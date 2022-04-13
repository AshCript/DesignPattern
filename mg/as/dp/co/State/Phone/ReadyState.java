package mg.as.dp.co.State.Phone;

public class ReadyState extends State{
  public ReadyState(Phone phone){
    super(phone);
    System.out.println("CURRENT STATE : READY\n");
  }

  public void onHome(){
    System.out.println("Already on READY STATE");
  }

  public void onOffOn(){
    System.out.println("Switching to OFF STATE");
    phone.setState(new OffState(phone));
  }
}
