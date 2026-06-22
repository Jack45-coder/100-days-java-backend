package corejava.oops.abstraction;

public class SavingAccount extends BankAccount{

    public SavingAccount(String accNumber, double balance){
        super(accNumber, balance);
    }

    public void deposit(String accNumber, double amount){
        double newBal = getBalance() + amount;
        setBalance(newBal);
        System.out.println("deposited amount in savings account: " + amount);
        System.out.println("Current Balance: " + getBalance());
    }

    public void withdrawal(String accNumber, double amount){
        if(getBalance() >= amount){
            double newBal = getBalance() - amount;
            setBalance(newBal);
            System.out.println("withdrawn amount in savings account: " + amount);
            System.out.println("Current Balance: " + getBalance());
        }else {
            System.out.println("Insufficient balance");
        }

    }
}
