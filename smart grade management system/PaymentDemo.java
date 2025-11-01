
interface payment {
    void processPayment(double amount);
}

class UPI implements payment {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI.");
    }
}

class Wallet implements payment {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " via Wallet.");
    }
}

class CreditCard implements payment {
    public void processPayment(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        payment p1 = new UPI();
        payment p2 = new Wallet();
        payment p3 = new CreditCard();

        p1.processPayment(500);
        p2.processPayment(1000);
        
        p3.processPayment(2500);
    }
}