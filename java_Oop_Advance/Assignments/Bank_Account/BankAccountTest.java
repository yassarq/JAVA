public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount yassar = new BankAccount();
        BankAccount mario = new BankAccount();
        yassar.depositeChecking(100.00);
        yassar.depositeChecking(150.00);
        mario.depositeChecking(200.00);
        mario.depositeChecking(500.00);
        System.out.println(mario.getCheckingBal());
        System.out.println(BankAccount.getNumAccounts());
        System.out.println(BankAccount.getTotalBalance());
    }
}