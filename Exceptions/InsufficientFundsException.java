package Exceptions;

public class InsufficientFundsException extends Exception{

    private final int currentCashTake;
    private final int currentDeposit;
    private final int currentBalance;


    public InsufficientFundsException(int currentCashTake, int currentDeposit, int currentBalance) {
        this.currentCashTake = currentCashTake;
        this.currentDeposit = currentDeposit;
        this.currentBalance = currentBalance;
    }

    @Override
    public String getMessage() {
        boolean hugeCashTake = currentCashTake > currentDeposit + currentBalance;
        return String.format("%s",
        ((hugeCashTake) ? "Вы можете снять деньги" : "Недостаточно денег на счету"));
    }
}
