/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbankaccount;

/**
 *
 * @author cui
 */
import java.util.Scanner;
public class BankAccount {
    private String AccountTitle;
    private String AccountNumber;
    private double balance;
    private boolean AccountStatus;
    public BankAccount(){
        this.AccountTitle="Unknown";
        this.AccountNumber="N/A";
        this.balance=0.0;
        System.out.println(this.AccountTitle+"\n"+this.AccountNumber+"\n"+this.balance);
    }
    public BankAccount(String At,String AN,double b){
        this.AccountTitle=At;
        this.AccountNumber=AN;
        this.balance=b;
       System.out.println(At+"\n"+AN+"\n"+b);
    }
    public BankAccount(BankAccount ref){
        this.AccountTitle=ref.AccountTitle;
        this.AccountNumber=ref.AccountNumber;
        this.balance=ref.balance;
        System.out.println(ref.AccountTitle+"\n"+ref.AccountNumber+"\n"+ref.balance);
    }

    public String getAccountTitle() {
        return AccountTitle;
    }

    public void setAccountTitle(String AccountTitle) {
        this.AccountTitle = AccountTitle;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void Deposit(){
        System.out.println("---------------------------------------------------------");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount which you want to Deposit:");
        double d=input.nextDouble();
        this.balance+=d;
        System.out.printf("Your new Account Balance is:%f\n",this.balance);
        System.out.println("---------------------------------------------------------\n");
    }
    public void Withdraw(){
        System.out.println("---------------------------------------------------------");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the amount which you want to Withdraw:");
        double d=input.nextDouble();
        if(d<=this.balance){
        this.balance-=d;
        System.out.printf("Your new Account Balance is:%f\n",this.balance);}
        else
            System.out.println("Insufficient balance");
        System.out.println("---------------------------------------------------------\n");
    }
    public void transfer(BankAccount t){
        System.out.println("---------------------------------------------------------");
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the ammount which you to transfer");
       double ammount=input.nextDouble();
       if(ammount<=this.balance){
          t.balance+=ammount;
          this.balance-=ammount;
          System.out.println(this.AccountTitle+"\n"+this.AccountNumber+"\n"+this.balance);
    }
       else{
          System.out.println("Insufficient Balance:");
       }
       System.out.println("---------------------------------------------------------\n");
    }
    }

