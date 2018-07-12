import java.util.Random;

public class BankAccount {
    private String accountNum;
    private double checkingBal;
    private double savingsBal;
    private static int numAccounts = 0;
    private static double totalBalance = 0;
    
    private String randomAcct() {
        Random r = new Random();
        String newStr = "";
        for (int i = 0; i < 10; i++) {
            newStr += r.nextInt(10);
        }
        return newStr;
    }
    public BankAccount() {
        accountNum = randomAcct();
        numAccounts++;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getCheckingBal() {
        return checkingBal;
    }
    public void setCheckingBal(double checkingBal) {
        this.checkingBal = checkingBal;
    }
    public double getSavingsBal() {
        return savingsBal;
    }
    public void setSavingsBal(double savingsBal) {
        this.savingsBal = savingsBal;
    }
    public static int getNumAccounts() {
        System.out.println("Total Accounts:");
        return numAccounts;
    }
    public static double getTotalBalance() {
        System.out.println("Total amount circulating:");
        return totalBalance;
    }
    public void depositeChecking(double atm) {
        checkingBal += atm;
        totalBalance += atm;
    }
    public void depositeSavings(double atm) {
        savingsBal += atm;
        totalBalance += atm;
    }
    public void withdrawChecking(double atm) {
        if (getCheckingBal() - atm < 0) System.out.println("Insufficient funds");
        else {
            checkingBal -= atm;
            totalBalance -= atm;
        }
    }
    public void withdrawSavings(double atm) {
        if (getSavingsBal() - atm < 0) System.out.println("Insufficient funds");
        else {
            savingsBal -= atm;
            totalBalance -= atm;
        }
    }
    public void totalInAccount() {
        double total = savingsBal + checkingBal;
        System.out.println("Total in the accounts:" + total);
    }
    
}