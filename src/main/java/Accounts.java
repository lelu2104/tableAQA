import java.util.Objects;

public class Accounts extends User{
        private int accountId;
        private int balance;
        private String currency;

    public Accounts(int accountId,int userId, int balance, String currency) {
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public int hashCode(){
        return Objects.hash(accountId, getUserId(), balance, currency );
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "accountId=" + accountId +
                ", userId='" + getUserId() + '\'' +
                ", balance='" + balance + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}