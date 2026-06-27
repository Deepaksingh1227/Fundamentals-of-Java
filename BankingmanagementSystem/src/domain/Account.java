package domain;

public class Account {
    private String accountNumber;
    private String customerId;
    private Double balance;
    private String accountType;

    public Account(String accountNumber, String customerId, Double balance, String accountType){
        this.accountNumber=accountNumber;
        this.accountType= accountType;
        this.balance=balance;
        this.customerId=customerId;

    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public String  getAccountType(){
        return accountType;
    }
    public String getCustomerId(){
        return customerId;
    }
    public Double getBalance(){
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType){
        this.accountType=accountType;
    }
    public void setCustomerId(String customerId){
        this.customerId=customerId;
    }
    public void setBalance(Double balance){
        this.balance=balance;
    }
}

