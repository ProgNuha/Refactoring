/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class ATM {
//    private Account account;
    private static final int WITHDRAWAL = 1;
    private static final int TRANSFER = 2;
    private static final int DEPOSIT = 3;
    
    public ATM(){};
    
    public void run(){
//        account.createTransaction();
//        Transaction currentTransaction = null;
//        Account _account = null;
        Account _account = new Account();
        ATM newATM = new ATM();
        int menu = newATM.displayMainMenu();
//        switch(menu){
//            case WITHDRAWAL:
//            case TRANSFER:
//            case DEPOSIT:
        //Error NullPointerExeption
                
                Transaction currentTransaction = _account.choosenTransaction(menu);
//                currentTransaction.modifies(account.getBalance());
                currentTransaction.modifies(500);
//                break;
//        }2
    }
    
    public int displayMainMenu() {
        Scanner myInput = new Scanner( System.in );
        System.out.println("Main menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Transfer");
        System.out.println("3. Deposit");
        System.out.print("> ");
        int menu = myInput.nextInt();

        return menu; // return user's selection
    }
}
