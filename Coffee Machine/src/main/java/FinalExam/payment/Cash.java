package FinalExam.payment;

public class Cash implements PaymentMethod {
    private double cash;

    public Cash(double cash) {
        this.cash = cash;
    }

    @Override
    public void pay(double amount) {
        this.cash-=amount;
        System.out.println("You have paid " + amount +" lei");
    }

}
