package ex3;


import java.util.TreeSet;

public class Bank {
    private TreeSet<ex3.BankAccount> bankAccount;


    public Bank() {
        this.bankAccount = new TreeSet<>();
    }

    public Bank(String bankName) {
        bankAccount = new TreeSet<>();
    }

    public void addAccount(String owner, double balance){
        this.bankAccount.add(new ex3.BankAccount(owner,balance));
    }

    public void printAccounts(){

        this.bankAccount.stream().forEach(System.out::println);
    }

    public void printAccounts(double minBalance, double maxBalance){

        this.bankAccount.stream()
                .filter(bankAccount -> bankAccount.getBalance()>=minBalance && bankAccount.getBalance()<=maxBalance)
                .forEach(System.out::println);
    }


    public ex3.BankAccount getAccount(String owner0){
        return bankAccount.stream()
                .filter(bankAccount -> bankAccount.getOwners().equals(owner0))
                .findFirst()
                .orElse(null);

    }

    public BankAccount getBankAccount(String owner0) {
        return this.bankAccount.stream().filter(bankAccount -> bankAccount.getOwners().equals(owner0)).findFirst().orElse(null);

    }

    public static void main(String[] args) {
        Bank b = new Bank();
       // Bank bb = new Bank("BT");

        b.addAccount("Marcel", 333);
        b.addAccount("Gigi", 537);

       // b.printAccounts();
       // bb.printAccounts();

    }


}
