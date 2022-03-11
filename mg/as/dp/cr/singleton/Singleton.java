package mg.as.dp.cr.singleton;

public class Singleton {
  private static int counter = 0;
  private static Singleton instance = null;
  public static Singleton getInstance(){
    instance = (instance == null) ? new Singleton() : instance;
    return instance;
  }
  private Singleton(){
    System.out.println("Counter : " + ++counter);
  }
  public void printDetails(String msg){
    System.out.println(msg);
  }
}
