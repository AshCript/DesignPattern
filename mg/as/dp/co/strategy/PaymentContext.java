package mg.as.dp.co.strategy;

public class PaymentContext {
  private PaymentStrategy strategy;

  public PaymentContext(){

  }
  
  public PaymentContext(PaymentStrategy strategy) {
    this.strategy = strategy;
  }

  public void executePayment(){
    if(strategy == null){
      System.err.println("Aucun moyen de paiement n'a été défini");
      return;
    }
    strategy.pay();
  }

  public void setStrategy(PaymentStrategy strategy) {
    this.strategy = strategy;
  }
}
