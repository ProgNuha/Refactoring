/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoring;
import java.util.Date;
/**
 *
 * @author acer
 */
public abstract class Transaction {
//    private Date date;
//
//    public Transaction(Date date){
//        this.date = date;
//    }
//    
//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }
    
    public Transaction(){
        
    }
    
    
    abstract public void modifies(int balance);   
    
}
