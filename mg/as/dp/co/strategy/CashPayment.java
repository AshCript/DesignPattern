package mg.as.dp.co.strategy;

public class CashPayment implements PaymentStrategy{

  @Override
  public void pay() {
    System.out.println("Paiement CashPayment effectué avec succes");
  }
  
}
