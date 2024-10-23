import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BankAccount {
    private String accountHolderName;
    private double balance;
    private double monthlyInterestRate;
    private int withdrawalCount;
    private static final int MAX_WITHDRAWALS = 3;
    private ArrayList<String> transactionHistory;

    public BankAccount(String accountHolderName, double initialBalance, double monthlyInterestRate) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.monthlyInterestRate = monthlyInterestRate;
        this.withdrawalCount = 1;
        this.transactionHistory = new ArrayList<>();
        logTransaction("So du ban dau", initialBalance);
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Ban da gui " + amount + "VND");
            logTransaction("Deposit", amount);
        } else {
            System.out.println("So tien khong hop le");
        }
    }

    public void withdraw(double amount){
        if(withdrawalCount > MAX_WITHDRAWALS){
            System.out.println("Ban da dat gioi han rut tien thang nay");
            return;
        } 
        if(amount > 0 && amount <= balance){
            balance -= amount;
            withdrawalCount++;
            System.out.println("Ban da rut " + amount + "VND");
            logTransaction("Withdrawal", amount);
        } else {
            if(amount < 0) System.out.println("So tien khong hop le");
            else System.out.println("Tai khoan khong du tien");
        }
    }

    public void applyMothlyInterest(){
        double interest = balance * (monthlyInterestRate / 100);
        balance += interest;
        logTransaction("Interest added", interest);
    }

    public void printTransactionHistory() {
        System.out.println("Lich su giao dich:");
        for (int i = 0; i < transactionHistory.size(); i++) {
            System.out.println((i + 1) + ". " + transactionHistory.get(i));
        }
    }

    public double getBalance(){
        return balance;
    }

    private void logTransaction(String type, double amount) {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        transactionHistory.add(type + ": " + amount + " VND " + "- " + date);
    }
}
