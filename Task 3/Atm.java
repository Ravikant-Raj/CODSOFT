import java.util.Scanner;

public class Atm {

   
    
    private BankAccount account;
    private Scanner scanner;

    

    public Atm(BankAccount account){
        this.account = account;
        this.scanner = new Scanner(System.in);
    }   

    public void run() {
        while (true) {
            displayMenu();
            int option = getOptionFromUser();
            processOption(option);
        }
    }

    private void displayMenu() {
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Chek Balance");
        System.out.println("4. Exit");

    }
    private int getOptionFromUser() {
        
        System.out.println("Enter Your choice: ");
        return scanner.nextInt();

    }
    private void processOption(int option) {
        switch (option) {
            case 1:
                withdraw();
                break;
            case 2:
                deposit();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for Using Atm Services!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option . Please try again .");
        }
    }

    private void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. new balance is: " + account.getBalance());
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    private void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful. New balance is: " + account.getBalance());
    }
    private void checkBalance(){
        System.out.println("Your balance is: " + account.getBalance());
    }
}