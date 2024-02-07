package com.corejava;

import java.util.Scanner;

class Atm1
{
	int balance=1000;
	int pin=1234;
    public void checkpin() 
    {
    	System.out.println("Enter Your Pin:");
    	Scanner s =new Scanner(System.in);
    	int enteredpin=s.nextInt();
    	if(enteredpin==pin)
    	{
    		menu();
    	}
    	else 
    	{
    		System.out.println("Enter Valid pin.");
    		
    	}	
   
    	}
        public void menu() 
        {
    	 System.out.println("Enter choice");
    	 System.out.println("1.check Balance");
    	 System.out.println("2.Withdraw Money");
    	 System.out.println("3.Deposite Money");
    	 System.out.println("4.Exit");
    	
    	
    	 Scanner sc=new Scanner(System.in);
    	 int opt=sc.nextInt();
    	
    	 if(opt==1)
    	 {
    		checkbalance();
    	 }
    	 else if(opt==2) 
    	 {
    		withdrawbalance();
    	 }
    	 else if(opt==3) 
    	 {
    		depositemoney();
    	 }
    	 else if(opt==4)
    	 {
    		 return;
    	 }
    	 else 
    	 {
    		System.out.println("Enter valid choice");
    	 }
}
    public void checkbalance() 
    {
    	System.out.println("Balance:"+balance);
    	menu();
    }
    public void withdrawbalance()
    {
    	System.out.println("Enter Amount to withdraw:");
    	Scanner s=new Scanner(System.in);
    	int enteramt=s.nextInt();
    	if(enteramt>balance)
    	{
    		System.out.println("Insufficient Amount");
    		menu();
    		
    	}
    	else
    	{
    		balance=balance-enteramt;
    		System.out.println("money withdraw Sucessfully");
    		menu();
    	}
    	
    	
    }
    public void depositemoney() 
    {
    	System.out.println("Enter amount to deposite");
    	Scanner s=new Scanner(System.in);
    	int amt=s.nextInt();
    	balance=amt+balance;
    	System.out.println("Deposite Successful");
    	menu();
    	
    }
	
}

public class ATM
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Atm1 a=new Atm1();
		a.checkpin();

	}

}
