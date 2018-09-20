public class BankAccount {
    private int accountNumber;
    private String owner;
    private int balance;

    public void setAccountNumber(int i){
        accountNumber = i;
    }
    public void setOwner(String s){
        owner = new String(s);
    }
    public void setBalance(int i){
        balance = i;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getOwner(){
        return owner;
    }
    public int getBalance(){
        return balance;
    }

    public void deposit(){
        balance += 10000;
    }

    public void withdraw(){
        balance -= 8000;
    }

    public void transfer(){
        balance = 1000;
    }

}
