package com.greatlearning.service;

import java.util.Scanner;

public class Banking {
	
	Scanner sc = new Scanner(System.in);
	OTPGenerator otpG = new OTPGenerator();

	
	int balance = 1000;
	
	public void deposit() {
		int amount;
		System.out.println("Enter the amount to be deposited");
		amount = sc.nextInt();
		if(amount>0) {
			balance = balance + amount;
			
			System.out.println("Total Balance amount "+ balance);
		}
		else {
			System.out.println("Enter the Correct Amount");
		}
	}
	
	public void withdrawl() {
		
		int amount;
		
		System.out.println("Enter the amount to be withdrawl");
		amount = sc.nextInt();
		
		if(amount > 0 && balance-amount>=0) { // Balance  = 1000 amount = 1500 1000- (-500) = -500
			
			balance = balance - amount;
			
			System.out.println("Balance Amount " + balance);
			
			System.out.println("Amount Withdrawn Scucessfully");
						
		}
		else {
			System.out.println("Insufficent balance");
		}
	}
	
	public void transfer() {
		int amount, otp, otpgenerated,bankAcctNo;
		
		
			otpgenerated = otpG.otpGenerated();
		
		System.out.println(otpgenerated);
		System.out.println("Enter the OTP");
		otp = sc.nextInt();
		
		if(otp == otpgenerated)
		{
			System.out.println("Verifciation Scucessfull");
		
		
		System.out.println(" enter the amount to be transferred and Account number");
		
		amount = sc.nextInt();
		
		bankAcctNo = sc.nextInt();
		
		if(balance-amount>0) {
			
			System.out.println("Amount " + amount +"Transferred scucessfully");
			
			balance  = balance - amount;
			
			System.out.println("Balance " + balance);
	
		}
		else
		{
			System.out.println("Transfer failed");
		}
		}
		else {
			System.out.println("Invlaid Otp");
		}
	}
	

}
