package Service;

import V1.Exceptions.TransactionException;
import V1.Models.BaseAccount;

public class Transactions {
    public void transaction1(BaseAccount baseAccount, BaseAccount baseAccount1, int number) throws TransactionException  {

        int newBalance;
        int newBalance1;
        newBalance = baseAccount.getBalance() - number;
        if(baseAccount.getBalance() - number < 0){
            throw new TransactionException(baseAccount.getBalance(), number);
        } else {
            baseAccount.setBalance(newBalance);
            newBalance1 = baseAccount1.getBalance() + number;
            baseAccount1.setBalance(newBalance1);
        }
    }
}

