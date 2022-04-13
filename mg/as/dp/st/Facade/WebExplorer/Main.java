package mg.as.dp.st.Facade.WebExplorer;

public class Main {
  public static void main(String[] args) {
    System.out.println();
    String test = "CheckElementPresent";
    WebExplorerHelperFacade.generateReport("firefox", "html", test);
    WebExplorerHelperFacade.generateReport("firefox", "junit", test);
    WebExplorerHelperFacade.generateReport("chrome", "html", test);
    WebExplorerHelperFacade.generateReport("chrome", "junit", test);
  }
}
