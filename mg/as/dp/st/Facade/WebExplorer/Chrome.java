package mg.as.dp.st.Facade.WebExplorer;
import java.sql.Driver;

public class Chrome {
  public static Driver getDriver(){
    return null;
  }
  public static void generateHtmlReport(String test, Driver driver){
    System.out.println("Generating HTML Report for Chrome Driver");
  }
  public static void generateJUnitReport(String test, Driver driver){
    System.out.println("Generating JUnit Report for Chrome Driver");
  }
}