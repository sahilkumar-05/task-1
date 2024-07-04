import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    //Add new accounts to bank
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account Holder Name =  " + account.getAccHolder() +  " ,Account No = " + account.getAccountNo() +
                " , Balance = " + account.getBalance() + " added.");
    }

    //View all accounts in the bank
    public void viewAccount() {

        for (Account account : accounts) {
            System.out.println("Account Number = " + account.getAccountNo() + ", Account Holder Name = "
            + account.getAccHolder() + ", Balance = " + account.getBalance());
        }
    }
    //Find an account by account number
    public Account findAccount(String accountNo){
        for(Account account : accounts){
            if(account.getAccountNo().equals(accountNo)){
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
}
