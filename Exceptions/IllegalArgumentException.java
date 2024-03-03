package Exceptions;

public class IllegalArgumentException extends Exception{

    private final int currentBalance;
    private final int currentDeposit;



    public IllegalArgumentException(int currentBalance, int currentDeposit) {
        this.currentBalance = currentBalance;
        this.currentDeposit = currentDeposit;
    }

    @Override
    public String getMessage() {
        boolean zeroBalance = currentBalance > 0;
        boolean zeroDeposit = currentDeposit > 0;
        return String.format("%s\n%s",
                ((zeroBalance) ? "Баланс = " + currentBalance : "Ваш баланс имеет отрицательное значение = " + currentBalance),
                ((zeroDeposit) ? "Депозит = " + currentDeposit : "Ваш депозит имеет отрицательное значение =  " + currentDeposit));
    }

}
