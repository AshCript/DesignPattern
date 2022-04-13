package mg.as.dp.co.State.Person;

public class Person {
  protected PersonState personState;

  public Person(){
    personState = new SleepingState(this);
  }

	public void setState(PersonState personState) {
    this.personState = personState;
	}

  public void getCurrentStateName(){
    System.out.println(personState.getCurrentStateName());
  }

  public void onSleeping(){
    personState.onSleeping();
  }
  public void onWakingUp(){
    personState.onWakingUp();
  }
  public void onWalking(){
    personState.onWalking();
  }
  public void onStopping(){
    personState.onStopping();
  }
  public void onStandingUp(){
    personState.onStandingUp();
  }
  public void onSitting(){
    personState.onSitting();
  }
}
