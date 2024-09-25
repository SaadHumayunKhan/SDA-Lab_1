package SDA;
//With polymorphism
abstract class PaymentMethod {
   public abstract void makePayment(double amount);
}

class CreditCard extends PaymentMethod {
   private String cardNumber;


   public CreditCard(String cardNumber) {
       this.cardNumber = cardNumber;
   }


   @Override
   public void makePayment(double amount) {
       System.out.println("Processing Credit Card payment of $" + amount + " using card: " + cardNumber);
   }
}


class PayPal extends PaymentMethod {
   private String email;


   public PayPal(String email) {
       this.email = email;
   }


   @Override
   public void makePayment(double amount) {
       System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
   }
}


public class PolymorphismDemo {
   public static void main(String[] args) {

       PaymentMethod creditCardPayment = new CreditCard("1234-5678-9012-3456");

       PaymentMethod payPalPayment = new PayPal("user@example.com");

       creditCardPayment.makePayment(150.00);  
       payPalPayment.makePayment(85.50);
   }
}
