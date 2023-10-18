/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbankaccount;

/**
 *
 * @author cui
 */
public class TestBankAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount A=new BankAccount();
        BankAccount A1=new BankAccount("Ali","ABCDEF",50000);
        BankAccount A2=new BankAccount(A1);
        BankAccount A3=new BankAccount();
        A3.setAccountTitle("Ahmad");
        A3.setAccountNumber("abcd");
        A3.setBalance(400000);
        A3.Deposit();
        A3.Withdraw();
        A3.transfer(A1);
    }
    
}
