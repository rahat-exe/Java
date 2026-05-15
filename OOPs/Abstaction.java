// Abstract class — the "what", not the "how"
abstract class PaymentMethod {
    abstract void pay(double amount); // no body, just the contract

    void printReceipt() {
        System.out.println("Payment successful. Receipt generated.");
    }
}

class CashPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Cash.");
    }
}

class CreditCardPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card. Processing network fees...");
    }
}

class UPIPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI. Sending OTP...");
    }
}

public class Abstaction {
    public static void main(String[] args) {
        PaymentMethod p1 = new CashPayment();
        PaymentMethod p2 = new CreditCardPayment();
        PaymentMethod p3 = new UPIPayment();

        p1.pay(500); // Paid ₹500.0 using Cash.
        p2.pay(1500); // Paid ₹1500.0 via Credit Card. Processing network fees...
        p3.pay(200); // Paid ₹200.0 via UPI. Sending OTP...

        p1.printReceipt(); // shared behavior from abstract class
    }
}
