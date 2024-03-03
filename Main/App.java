package Main;

import Exceptions.InsufficientFundsException;
import Exceptions.TransactionException;
import Models.Account;
import Models.DebitAccount;
import Service.Transactions;

public class App {
    public static void main(String[] args) {

        try {
            Account account = Account.create(10, 4, 3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }


        try {
            Account account1 = new Account(5, 5, 0);
            DebitAccount debitAccount = new DebitAccount(7, 3, 0);
            Transactions transactions = new Transactions();
            transactions.transaction1(account1, debitAccount, 7);
            System.out.println(account1);
            System.out.println(debitAccount);
        } catch (TransactionException e) {
            System.out.println(e.getMessage());
        }
    }
}

