public class SavingsAccount extends BankAccount{

    private double accountBalance;
    private double annualInterestRate;

    public SavingsAccount(double balance, double interestRate) {

        accountBalance = balance;
        annualInterestRate = interestRate;
    }

    public void withdraw(double withdrawAmount) {
        accountBalance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getInterestRate() {
        return annualInterestRate;
    }
}