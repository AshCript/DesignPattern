package mg.as.dp.st.Facade.WebExplorer;

import java.sql.Driver;

public class WebExplorerHelperFacade {
  public static void generateReport(String explorer, String report, String test){
    Driver driver = null;
    switch(explorer){
      case "firefox" :
        driver = Firefox.getDriver();
        switch(report){
          case "html":
            Firefox.generateHtmlReport(test, driver);
            break;
          case "junit":
            Firefox.generateJUnitReport(test, driver);
            break;
          default:
            break;
        }
        break;
      case "chrome" :
        driver = Chrome.getDriver();
        switch(report){
          case "html":
            Chrome.generateHtmlReport(test, driver);
            break;
          case "junit":
            Chrome.generateJUnitReport(test, driver);
            break;
          default:
            break;
        }
        break;
      default:
        System.out.println("Something went wrong!");
        break;
    }
  }
}