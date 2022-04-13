package mg.as.dp.co.State.Person;

public class StoppingState extends PersonState{

  public StoppingState(Person person) {
    super(person);
    currentStateName = "STOPPING";
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
    System.out.println("Switching to WALKING STATE");
    person.setState(new WalkingState(person));
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
