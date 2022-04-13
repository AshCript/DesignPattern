package mg.as.dp.co.State.Person;

public class SleepingState extends PersonState{

  public SleepingState(Person person) {
    super(person);
    currentStateName = "SLEEPING";
    System.out.println("CURRENT STATE : " + currentStateName + "\n");
  }

  @Override
  public String getCurrentStateName(){
    return currentStateName;
  }

  @Override
  public void onSleeping() {
  }

  @Override
  public void onWakingUp() {
    System.out.println("Switching to WAKE-UP STATE");
    person.setState(new WakeUpState(person));
    
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
    
  }
  
}
