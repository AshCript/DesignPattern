package mg.as.dp.co.strategy;

public class PayPalPayment implements PaymentStrategy {

  @Override
  public void pay() {
    System.out.println("Paiement PayPal effectué avec succes");
  }
}