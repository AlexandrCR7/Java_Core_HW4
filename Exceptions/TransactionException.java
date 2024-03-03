package Exceptions;

public class TransactionException extends Exception{

    private final int currentCashTake;
    private final int transferNumber;



    public TransactionException(int currentCashTake, int transferNumber) {
        this.currentCashTake = currentCashTake;
        this.transferNumber = transferNumber;

    }

    @Override
    public String getMessage() {
        boolean transfer = currentCashTake < transferNumber;
        return String.format("%s",
                ((transfer) ? "Вы не можете перевести данную сумму, недостаточно денег на счету" : "Перевод успешно произведен"));
    }
}
