package mg.as.dp.co.State.Person;

public class WakeUpState extends PersonState{

  public WakeUpState(Person person) {
    super(person);
    currentStateName = "WAKE-UP";
    System.out.println("CURRENT STATE : " + currentStateName + "\n");
  }

  @Override
  public String getCurrentStateName(){
    return currentStateName;
  }

  @Override
  public void onSleeping() {
    System.out.println("Switching to SLEEPING STATE");
    person.setState(new SleepingState(person));
  }

  @Override
  public void onWakingUp() {
    
  }

  @Override
  public void onWalking() {
    
  }

  @Override
  public void onStopping() {
    
  }

  @Override
  public void onStandingUp() {

  }

  @Override
  public void onSitting() {
    System.out.println("Switching to SITTING STATE");
    person.setState(new SittingState(person));
  }
}
