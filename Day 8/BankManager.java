public class BankManager {
    double account;
    double balance;
    public BankManager(double account, double balance) {
        this.account = account;
        this.balance = balance;
    }
    public void updateBal(double balance) {

    }

    public void deleteAccount (double account) {

    }
}
public class CheckingAccount extends BankManger {
    double limit;
}

public class SavingsAccount extends BankManager {
    double limit;
}

public class COD extends BankManager {
    double limit;
}
public class Main 
{ 
    public static void main(String[] args) 
    { 

