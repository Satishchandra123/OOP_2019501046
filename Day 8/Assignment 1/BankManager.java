class BankAccount {
    double accountNumber = 2134424343;
    double balance = 10000.56;
}
class CheckingAccount extends BankAccount {
    double Limit = 5000000;

}
class SavingsAccount extends BankAccount {

}
class CertificateOfDeposit extends BankAccount  {

}
final class BankAccountInheritance {
    public static void main(String args[]) {
    CheckingAccount obj1 = new CheckingAccount();
    System.out.println("AccountNumber:"+ obj1.accountNumber);
    SavingsAccount obj2 = new SavingsAccount();
    System.out.println("SavingsAccount:"+ obj2.accountNumber);
    CertificateOfDeposit obj3 = new CertificateOfDeposit();
    System.out.println("CertificateOfDeposit:"+ obj3.accountNumber);
    }
}



