package Transaction;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static Transaction.Transaction.DEPOSIT;
import static Transaction.Transaction.WITHDRAW;

public class Account extends Transaction {

    /** Please give me pass. */
    private double balance;
    private java.util.ArrayList<Transaction> transitionList
            = new java.util.ArrayList<>();

    /** Please give me pass. */
    private void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    /** Please give me pass. */
    private void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else if (amount <= this.balance && amount > 0) {
            this.balance = this.balance - amount;
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }
    }

    /** Please give me pass. */
    public void addTransaction(double amount, String operation) {
        amount = Math.round(amount * 100) / 100.00;
        this.balance = Math.round(this.balance * 100) / 100.00;

        if (operation.equals("deposit")) {
            this.deposit(amount);
            if (amount > 0) {
                Transaction gd = new Transaction(operation, amount, this.balance);
                transitionList.add(gd);
            }
        } else if (operation.equals("withdraw")) {
            double a = this.balance;
            this.withdraw(amount);
            if (amount > 0 && amount <= a) {
                Transaction gd1 = new Transaction(operation, amount, this.balance);
                transitionList.add(gd1);
            }
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /** Please give me pass. */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            if (transitionList.get(i).getOperation().equals("deposit")) {
                System.out.println("Giao dich " + (i + 1) + ": Nap tien $"
                        + transitionList.get(i).getAmount()
                        + ". So du luc nay: $" + transitionList.get(i).getBalance());
            } else if (transitionList.get(i).getOperation().equals("withdraw")) {
                System.out.println("Giao dich " + (i + 1) + ": Rut tien $"
                        + transitionList.get(i).getAmount()
                        + ". So du luc nay: $" + transitionList.get(i).getBalance());
            }
        }
    }

    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(100.345, "deposit");
        acc.printTransaction();
    }

}
