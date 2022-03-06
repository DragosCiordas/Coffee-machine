package ex1;

import java.util.Objects;

public class BankAccount {

    public String owners;
    public double balance;

    public BankAccount(String owners, double balance) {
        this.owners = owners;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
            System.out.println("SUCCESS! Current ballcance = " + this.balance);
        } else System.out.println("The requested amount is too high");
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
            System.out.println("Sum was added !BALANCE = " + this.balance);
        } else System.out.println("Invalid amount !");
    }

    public double getBalance() {
        return balance;
    }

    public String getOwners() {
        return owners;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(that.balance, balance) == 0 && Objects.equals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owners, balance);
    }

    public static void main(String[] args) {
        BankAccount me = new BankAccount("Dragos", 200);
        BankAccount you = new BankAccount("mihai", 150);
        System.out.println("The owner is " + me.getOwners() + " the balance =" + me.getBalance());
        me.withdraw(200);
        System.out.println("The owner is " + me.getOwners() + " the balance =" + me.getBalance());
        me.deposit(150);
        me.withdraw(500);
        me.deposit(-150);

        System.out.println(me.equals(me));
        System.out.println(you.equals(me));


    }

}
