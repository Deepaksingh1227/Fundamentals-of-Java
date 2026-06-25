package domain;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private String accountNumber;
    private Type type;
    private Double amount;
    private LocalDateTime timestamp;
    private String note;


    public Transaction(String  id, String accountNumber, Type type, Double amount, LocalDateTime timestamp, String note){
        this.id=id;
        this.accountNumber=accountNumber;
        this.amount=amount;
        this.type=type;
        this.timestamp=timestamp;
        this.note=note;

    }
    //getters
    public String  getId(){
        return id;
    }
    public String getAccountNumber(){
        return accountNumber;

    }
    public Type getType(){
        return type;
    }
    public Double getAmount(){
        return amount;
    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }
    public String getNote(){
        return note;

    }
    // setters

    public void setId(String id){
        this.id=id;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setType(Type type){
        this.type=type;

    }
    public void setAmount(Double amount){
        this.amount=amount;
    }
    public void setTimestamp(LocalDateTime timestamp){
        this.timestamp=timestamp;
    }
    public void setNote(String note){
        this.note=note;
    }
}
