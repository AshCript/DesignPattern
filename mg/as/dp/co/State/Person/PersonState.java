package mg.as.dp.co.State.Person;

public abstract class PersonState {
  protected Person person;
  protected String currentStateName;
  public PersonState(Person person){
    this.person = person;
  }

  public abstract void onSleeping();
  public abstract void onWakingUp();
  public abstract void onWalking();
  public abstract void onStopping();
  public abstract void onStandingUp();
  public abstract void onSitting();
  public abstract String getCurrentStateName();
}