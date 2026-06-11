public class abstractionDemo {


    public static void main(String[] args) {

        SavingAccount savingAccount =new SavingAccount();
        savingAccount.deposit(10000);

        BankAccount s1= new SavingAccount();
        s1.withdraw(5000);

        s1= new CurrentAccount();

        s1.deposit(7000);






    }
}