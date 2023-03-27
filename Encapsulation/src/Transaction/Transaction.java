package Transaction;

public class Transaction {

    /** Create constructor. */
    public Transaction() {

    }

    private String operation;
    private double amount;
    private double balance;

    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /** Please give me pass. */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /** Please give me pass. */
    public String getOperation() {
        return operation;
    }

    /** Please give me pass. */
    public void setOperation(String op) {
        this.operation = op;
    }

    /** Please give me pass. */
    public double getAmount() {
        return amount;
    }

    /** Please give me pass. */
    public void setAmount(double am) {
        this.amount = am;
    }

    /** Please give me pass. */
    public double getBalance() {
        return balance;
    }

    /** Please give me pass. */
    public void setBalance(double bal) {
        this.balance = bal;
    }
}
