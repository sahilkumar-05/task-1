public class Account {
    private String accountNo;
    private String accHolder;
    private double balance;

    public Account(String accountNo, String accHolder, double balance){
        this.accountNo = accountNo;
        this.accHolder = accHolder;
        this.balance = balance;
    }
    //getters and setters
    public String getAccountNo(){
        return accountNo;
    }
    public String getAccHolder(){
        return accHolder;
    }
    public double getBalance(){
        return balance;
    }
    //deposit amount
    public void depositAmount(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited. " + amount + " ,New Balance = " + balance + ".");
        }
        else{
            System.out.println("Insufficient deposit amount!");
        }
    }
    //withdraw amount
    public void withdrawAmount(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn. " + amount +" ,New Balance = " + balance + ".");
        }
        else{
            System.out.println("Insufficient withdraw amount!");
        }
    }
    //check balance
    public void checkBalance(){
        System.out.println("Current Balance = " + balance + ".");
    }
}
