public class Main{
    public static void main(String[] args) {
       
        BankAccount account = new BankAccount(1000.0);
        Atm atm = new Atm(account);
        atm.run();
    }
}
