public class Accounts extends User{
        private int accountId;
        private int balance;
        private char currency;

    public Accounts(int accountId,int userId, int balance, char currency) {
        super(userId);
        this.accountId = accountId;
        this.balance = balance;
        this.currency = currency;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }
}
