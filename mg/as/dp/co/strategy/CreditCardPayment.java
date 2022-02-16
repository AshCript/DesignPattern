package mg.as.dp.co.strategy;

public class CreditCardPayment implements PaymentStrategy{

  @Override
  public void pay() {
    System.out.println("Paiement CreditCard effectué avec succes");
  }
  
}
