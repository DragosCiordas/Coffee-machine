package ex2;

import ex1.BankAccount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bank {
    private List<BankAccount> bankAccount;

    public Bank() {
        this.bankAccount = new ArrayList<>();
    }

    public Bank(String bankName) {
        bankAccount = new ArrayList<>();
    }

    public void addAccount(String owner, double balance) {
        this.bankAccount.add(new BankAccount(owner, balance));
    }

    public void printAccounts() {
        this.bankAccount.stream()
                .sorted(Comparator.comparingDouble(BankAccount::getBalance))
                .forEach(System.out::println);
    }

    public void printAccounts(double minBalance, double maxBalance) {

        this.bankAccount.stream()
                .filter(bankAccount -> bankAccount.getBalance() >= minBalance && bankAccount.getBalance() <= maxBalance)
                .sorted(Comparator.comparingDouble(BankAccount::getBalance))
                .forEach(System.out::println);
    }

    public BankAccount getAccount(String owner) {
        return bankAccount.stream()
                .filter(bankAccount -> bankAccount.getOwners().equals(owner))
                .findFirst()
                .orElse(null);
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccount;
    }

    public void setBankAccount(List<BankAccount> bankAccount) {
        this.bankAccount = bankAccount;
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        b.addAccount("Marcel", 333);
        b.addAccount("Gigi", 537);
        System.out.println(b.getBankAccounts());


    }


}
