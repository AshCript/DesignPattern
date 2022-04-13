package mg.as.dp.co.State.Person;

public class WalkingState extends PersonState{

  public WalkingState(Person person) {
    super(person);
    currentStateName = "WALKING";
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
    
  }

  @Override
  public void onWalking() {
    
  }

  @Override
  public void onStopping() {
    System.out.println("Switching to STOPPING STATE");
    person.setState(new StoppingState(person));
  }

  @Override
  public void onStandingUp() {
    
  }

  @Override
  public void onSitting() {
    
  }

}
