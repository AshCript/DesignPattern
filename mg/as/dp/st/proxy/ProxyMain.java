package mg.as.dp.st.proxy;

public class ProxyMain {
  public static void main(String[] args) {
    CommandExecutor cmdLine = new CommandExecutorProxy("asjosvah", "root");

    try {
      cmdLine.executeCommand("ls -a");
      cmdLine.executeCommand("rm -r");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}