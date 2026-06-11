package corejava.oops.abstraction;

abstract public class BankAccount {
    private String accNumber;
    private double balance;

    public BankAccount(String accNumber, double balance){
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public abstract void deposit(String accNumber, double amount);

    public abstract void withdrawal(String accNumber, double amount);
}
