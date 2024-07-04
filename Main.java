import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        Bank bank = new Bank();
        Account account1 = new Account("111A", "Sahil", 25000);
        Account account2 = new Account("112A", "Akash", 30000);
        Account account3 = new Account("121A", "Abrar", 2000);
        Account account4 = new Account("1123A", "Ali", 35000);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
       while (true){
        System.out.println("\n\n\t\t\t\t\t\t WELCOME TO BANKING SYSTEM MANAGEMENT\n");
        System.out.println("Press 1 for display all Acconts");
        System.out.println("Press 2 for search any Account");
        System.out.println("Press 3 for withdraw amount");
        System.out.println("Press 4 for deposit amount");
        System.out.println("enter 5 for check balance");
            System.out.println("Enter 6 for exit");
        System.out.println("Enter your choice ");
        int choice=input.nextInt();

       switch (choice){
            case 1:
                System.out.println();
                bank.viewAccount();
                break;
            case 2:
                //Finding an account by number
                System.out.println("Enter account Number to Search");
                input.nextLine();
                String find=input.nextLine();

                Account account = bank.findAccount(find);
                if (account != null) {
                    System.out.println("Account Found. "+"\nName: "+account.getAccHolder() +"\nAccount Number: "+ account.getAccountNo() + "\nwith Balance: " + account.getBalance());
                }

                break;
            case 3:
                System.out.println("enter amount to withdraw");
                double withdraw=input.nextDouble();
                account1.withdrawAmount(withdraw);
                break;
            case 4:
                //Deposit withdraw and check balance of accounts
                System.out.println("Enter The amount Want to Deposit");
                double deposit=input.nextDouble();
                account1.depositAmount(deposit);
                break;
            case 5:
                account1.checkBalance();
                break;
           case 6:
               System.exit(1);
               break;

            default:
                System.out.println("incorrect choice!!!!!!!");


        }}









    }
}