class BankAccount {
    double accountNumber = 1210115108;
    String balance = "150000";
}
class CheckingAccount extends BankAccount {
    String limit = "10000000";
}
class SavingsAccount extends BankAccount {

}
class CertificateOfDeposit extends BankAccount {

}

final class BankAccountInheritance {
    public static void main(final String[] args) {
        CheckingAccount obj1 = new CheckingAccount();
        System.out.println(obj1.accountNumber);
        SavingsAccount obj2 = new SavingsAccount();
        System.out.println(obj2.accountNumber);
        CertificateOfDeposit obj3 = new CertificateOfDeposit();
        System.out.println(obj3.accountNumber);
    } 
}