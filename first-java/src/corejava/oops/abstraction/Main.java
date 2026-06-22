package corejava.oops.abstraction;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new CurrentAccount("870193935527", 1000);
        bankAccount.deposit("870193935527", 200);

        BankAccount savingAccount2 = new SavingAccount("37752489296", 2000);
        savingAccount2 = new CurrentAccount("37752489296", 1500);
        savingAccount2.deposit("37752489296",500);

        BankAccount currentAccount1 = new CurrentAccount("580118210006212", 2300);
        currentAccount1.deposit("580118210006212", 400);

        System.out.println(savingAccount2.getAccNumber());
        System.out.println(bankAccount.getAccNumber());
    }
}
