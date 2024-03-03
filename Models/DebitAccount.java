package Models;

import V1.Exceptions.InsufficientFundsException;

public class DebitAccount extends BaseAccount {

    private int balance;
    private int deposit;
    private int cashTake;

    public static DebitAccount create(int balance, int deposit, int cashTake) throws IllegalArgumentException,
            InsufficientFundsException {
        if(balance < 0){
            throw new IllegalArgumentException(balance, deposit);
        }
        else if(deposit < 0) {
            throw new IllegalArgumentException(balance, deposit);
        }
        else if(balance < cashTake){
            throw new InsufficientFundsException(balance, deposit, cashTake);
        }
        return new DebitAccount(balance, deposit, cashTake);
    }

    public DebitAccount(int balance, int deposit, int cashTake) {
        this.balance = balance;
        this.deposit = deposit;
        this.cashTake = cashTake;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getCashTake() {
        return cashTake;
    }

    public void setCashTake(int cashTake) {
        this.cashTake = cashTake;
    }

    @Override
    public String toString() {
        return "V1.Account{" +
                "balance=" + balance +
                ", deposit=" + deposit +
                ", cashTake=" + cashTake +
                '}';
    }
}
