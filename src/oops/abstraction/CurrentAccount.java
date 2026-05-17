package oops.abstraction;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accNumber, double balance){
        super(accNumber, balance);
    }

    public void deposit(String accNumber, double amount){
        double newBal = getBalance() + amount;
        setBalance(newBal);
        System.out.println("deposited amount in current account: " + amount);
        System.out.println("Current Balance: " + getBalance());
    }

    public void withdrawal(String accNumber, double amount){
        if(getBalance() >= amount){
            double newBal = getBalance() - amount;
            setBalance(newBal);
            System.out.println("withdrawn amount in current account: " + amount);
            System.out.println("Current Balance: " + getBalance());
        }else {
            System.out.println("Insufficient balance");

        }
    }
}
