package Models;

import V1.Exceptions.InsufficientFundsException;

public class CreditAccount extends BaseAccount {

    private int creditBalance;
    private int creditDeposit;
    private int creditCashTake;


    public static CreditAccount create(int balance, int deposit, int cashTake) throws IllegalArgumentException,
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
        return new CreditAccount(balance, deposit, cashTake);
    }

    public CreditAccount(int balance, int deposit, int cashTake) {
        this.creditBalance = balance;
        this.creditDeposit = deposit;
        this.creditCashTake = cashTake;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public int getCreditDeposit() {
        return creditDeposit;
    }

    public void setCreditDeposit(int creditDeposit) {
        this.creditDeposit = creditDeposit;
    }

    public int getCreditCashTake() {
        return creditCashTake;
    }

    public void setCreditCashTake(int creditCashTake) {
        this.creditCashTake = creditCashTake;
    }

    @Override
    public String toString() {
        return "V1.Account{" +
                "balance=" + creditBalance +
                ", deposit=" + creditDeposit +
                ", cashTake=" + creditCashTake +
                '}';
    }
}
