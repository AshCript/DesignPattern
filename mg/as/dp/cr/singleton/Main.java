package mg.as.dp.cr.singleton;

public class Main{
  public static void main(String[] args){
    Singleton a = Singleton.getInstance();
    Singleton b = Singleton.getInstance();
    a.printDetails("Singleton instance for a");
    b.printDetails("Singleton instance for b");
  }
}