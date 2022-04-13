package mg.as.dp.co.State.Person;

public class SittingState extends PersonState{

  public SittingState(Person person) {
    super(person);
    currentStateName = "SITTING";
    System.out.println("CURRENT STATE : SITTING\n");
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
    System.out.println("Switching to STAND-UP STATE");
    person.setState(new StandUpState(person));
  }

  @Override
  public void onSitting() {
    
  }

}
