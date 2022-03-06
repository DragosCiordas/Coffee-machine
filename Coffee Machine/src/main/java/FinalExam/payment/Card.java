package FinalExam.payment;

public class Card implements PaymentMethod {
    private double balance;
    private String card_number;

    public Card(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        this.balance -= amount;
        System.out.println("You have paid " + amount +" lei");
    }
}
