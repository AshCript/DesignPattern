package mg.as.dp.st.proxy;

public class CommandExecutorProxy implements CommandExecutor{

  private boolean isAdmin = false;
  private CommandExecutor commandExecutor;

  public CommandExecutorProxy(String login, String password){
    isAdmin = "asjosvah".equals(login) && "root".equals(password);
    commandExecutor = new CommandExecutorImpl();
  }

  @Override
  public void executeCommand(String cmd) throws Exception {
    if(isAdmin){
      System.out.println("Executing command " + cmd + " as ADMIN");
      commandExecutor.executeCommand(cmd);
    }else{
      if(cmd.contains("rm")){
        throw new Exception("You don't have admin access to execute this command");
      }else{
        commandExecutor.executeCommand(cmd);
      }
    }
  }
}
