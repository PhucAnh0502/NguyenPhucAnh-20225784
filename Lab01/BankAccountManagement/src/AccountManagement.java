public class AccountManagement {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Nguyen Van A", 5000000, 1.0);

        account.deposit(1000000);
        account.withdraw(3000000);
        account.applyMothlyInterest();
        account.withdraw(100000);
        account.withdraw(200000);
        account.withdraw(300000);

        account.printTransactionHistory();

        System.out.println();

        System.out.println("So du hien tai: " + account.getBalance());
    }
}
