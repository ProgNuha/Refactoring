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
public class Deposit extends Transaction {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

//    public Deposit(Date date) {
//        super(date);
//    }
    
    @Override
    public void modifies(int balance) {
        Account account = new Account();
        int _amount;
        int _balance = 0;
        Scanner myInput = new Scanner( System.in );
        
        System.out.println("Masukkan nominal");
        _amount = myInput.nextInt();
                
//        while(_amount > account.getBalance() || _amount <= 0){
//            System.out.print("Mohon maaf nominal yang anda masukan tidak valid");
//            System.out.print("Tolong inputkan kembali nominal");
//            System.out.println("Masukkan nominal");
//            _amount = myInput.nextInt();
//        }
        
        _balance = _amount + balance;
        account.setBalance(_balance);
        System.out.print("Deposit telah berhasil dilakukan");
        System.out.print("\n\nSaldo Anda : ");
        System.out.print(account.getBalance());
    }
    
}
