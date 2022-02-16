package mg.as.dp.st.proxy;

public class CommandExecutorImpl implements CommandExecutor{

  @Override
  public void executeCommand(String cmd) throws Exception {
    System.out.println("Command " + cmd + " was successfully executed!");
  }
}