public class Transactions extends Accounts {
    private int transacId;
    private int amount;

    public Transactions(int accountId, int userId, int balance, char currency, int transacId) {
        super(accountId, userId, balance, currency);
        this.transacId = transacId;
    }

    public int getTransacId() {
        return transacId;
    }

    public void setTransacId(int transacId) {
        this.transacId = transacId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int addMoney(int amount) {
       int balance = getBalance() + amount;
       return balance;
    }

    public int withdrawMoney(int amount) {
        if (getBalance() >= amount) {
            int balance = getBalance() - amount;
            return balance;
        } else {
            return  amount;
        }
    }
}
