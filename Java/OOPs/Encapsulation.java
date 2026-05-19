class BankAccount {
    private double balance; // hidden from outside
    private String pin; // hidden from outside

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount, String enteredPin) {
        if (!enteredPin.equals(pin)) {
            System.out.println("Wrong PIN!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() { // controlled access
        return balance;
    }

    public void setPin(String newPin) {
        pin = newPin;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        // System.out.println(b1.balance); // can't be accessed because of private

        b1.deposit(500);
        b1.setPin("1234");
        b1.withdraw(400, "1234");
        double balance = b1.getBalance();
        System.out.println(balance);
    }
}
