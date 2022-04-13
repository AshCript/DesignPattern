package mg.as.dp.co.State.Person;

public class StandUpState extends PersonState{

  public StandUpState(Person person) {
    super(person);
    currentStateName = "STAND-UP";
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
    System.out.println("Switching to MOVING STATE");
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
