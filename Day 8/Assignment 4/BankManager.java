class BankAccount {
    private int accountNumber;
    private String Name;
    private int balance;
    private int limit;
    private String accountType;
    private int monthsOld;
    static int rateOfInterest = 8;

    BankAccount() {

    }
    BankAccount(final int accountNumber,final String Name, final int balance, final int limit, final String accountType, final int monthsOld) {
        this.accountNumber = accountNumber;
        this.Name = Name;
        this.balance = balance;
        this.limit = limit;
        this.accountType = accountType;
        this.monthsOld = monthsOld;
    }
    public String getAccountInfo() {
         return this.accountNumber + "\t" + this.Name + "\t" + this.balance + "\t" + this.limit + "\t" + this.accountType + "\t" + this.monthsOld;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public int getMonthsOld() {
        return this.monthsOld;
    }

    public void setMonthsOld(int monthsOld) {
        this.monthsOld = monthsOld;
    }

}

class CheckingAccount extends BankAccount {
    boolean isSavings() {
        return (this.getAccountType().toLowerCase()).equals("savings");
    }

    boolean isCurrent() {
        return (this.getAccountType().toLowerCase()).equals("current");
    }
}
class SavingsAccount extends BankAccount {

    int availableLimit(BankAccount account) {
        return account.getLimit() - account.getBalance();
    }

    void doubleLimit(BankAccount account) {
        int currentLimit = account.getLimit();
        account.setLimit(currentLimit * 2);
    }
}

class CertificateOfDeposit extends BankAccount {

    double calculateInterest(BankAccount account) {


        int principle = account.getBalance();
        int time = account.getMonthsOld();
        int rate = rateOfInterest;

        return (principle* (time/ (double)12) * rate ) / 100.0;
    }
}
final class BankManager { 
    public static void main(String[] args) {
        
            BankAccount myAccount = new BankAccount(1210115108, "SatishChandra", 10000, 5000000, "Savings",12);
            
            CertificateOfDeposit obj1 = new CertificateOfDeposit();

            System.out.println(obj1.calculateInterest(myAccount));

            SavingsAccount obj2 = new SavingsAccount();
            System.out.println(obj2.availableLimit(myAccount));
    }
}
