package SDA;
//Without polynorphism

public class  PaymentProcessor {
    

   public void processCreditCardPayment(double amount, String cardNumber) {
       System.out.println("Processing Credit Card payment of $" + amount + " using card: " + cardNumber);
   }


   public void processPayPalPayment(double amount, String email) {
       System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
   }

   

   public static void main(String[] args) {
       PaymentProcessor paymentProcessor = new PaymentProcessor();
       

       paymentProcessor.processCreditCardPayment(150.00, "1234-5678-9012-3456");
       
       paymentProcessor.processPayPalPayment(85.50, "user@example.com");
   }
}
