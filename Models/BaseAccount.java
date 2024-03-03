package Models;

public class BaseAccount {
    private int balance;
    private int deposit;
    private int cashTake;
//
//
//    public BaseAccount(int balance, int deposit, int cashTake) {
//        this.balance = balance;
//        this.deposit = deposit;
//        this.cashTake = cashTake;
//    }
//
//    public static Account create(int balance, int deposit, int cashTake, int summ) throws IllegalArgumentException,
//            InsufficientFundsException, TransactionException {
//        if(balance < 0){
//            throw new IllegalArgumentException(balance, deposit);
//        }
//        else if(deposit < 0) {
//            throw new IllegalArgumentException(balance, deposit);
//        }
//        else if(balance < cashTake){
//            throw new InsufficientFundsException(balance, deposit, cashTake);
//        }
//        return new Account(balance, deposit, cashTake);
//    }

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
}
