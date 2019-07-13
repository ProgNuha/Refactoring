/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Account {
    private static final int WITHDRAWAL = 1;
    private static final int TRANSFER = 2;
    private static final int DEPOSIT = 3;
    private int balance;
//    private int number;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
//    public void createTransaction(){
//        Transaction currentTransaction = null;
//        int Balance = 0;
//        Account account = new Account();
//        int menu = account.displayMainMenu();
//        switch(menu){
//            case WITHDRAWAL:
//            case TRANSFER:
//            case DEPOSIT:
                
//                currentTransaction = choosenTransaction(menu);
//                currentTransaction.modifies(account.getBalance());
//                currentTransaction.modifies(500);
//                break;
//        }
//        this.balance = Balance;
//    }
       
    public Transaction choosenTransaction(int menu){
        Transaction temp = null; 
//        Date date = new Date();
        switch (menu){
            case WITHDRAWAL:
                temp = new Withdraw();
                break;
            case TRANSFER:
                temp = new Transfer();
                break;
            case DEPOSIT:
                temp = new Deposit();
                break;
        }
        return temp;
    }
}
