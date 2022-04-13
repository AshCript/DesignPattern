package mg.as.dp.co.State.Phone;

public class Main {
  public static void main(String[] args) {
    System.out.println("\nINITIAL STATE");
    System.out.println("----------------------");
    Phone phone = new Phone();
    phone.onHome();
    phone.onOffOn();
    phone.onHome();
    phone.onHome();
    phone.onHome();
    phone.onOffOn();
    phone.onOffOn();
  }
}
