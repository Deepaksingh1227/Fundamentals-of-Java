public class CurrentAccount extends BankAccount {

    @Override
    public void deposit(double amount){
        System.out.println("Cash Deposited");
    }


    @Override
    public void withdraw(double amount){
        System.out.println("Cash Withdrawn");
    }
}
