package mg.as.dp.co.strategy;

public class MainPaymentClass {
  public static void main(String[] arg){
    PaymentContext paymentContext = new PaymentContext(new PayPalPayment());
    paymentContext.executePayment();
    paymentContext.setStrategy(null);;
    paymentContext.executePayment();
    paymentContext.setStrategy((new CreditCardPayment()));
    paymentContext.executePayment();

  }
}