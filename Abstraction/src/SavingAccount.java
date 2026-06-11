import java.sql.SQLOutput;

public class SavingAccount extends BankAccount {


    @Override

     public void deposit(double amount){
        System.out.println(" cash Deposited");
    }

    @Override
    public void withdraw(double amount){
        System.out.println(" cash withdrawn");
    }
}
