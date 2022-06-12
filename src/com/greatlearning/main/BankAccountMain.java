package com.greatlearning.main;

import com.greatlearning.model.customer;
import com.greatlearning.service.Banking;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bankAccountNo;
		String password;
		customer cus = new customer("2345656","password");
		
		Banking banking = new Banking();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Account No:");
		bankAccountNo = sc.nextLine();
		System.out.println("Please enter Password");
		password = sc.nextLine();
		
		if(cus.getBankAccountNo().equals(bankAccountNo) && cus.getPassword().equals(password)) {
			
			System.out.println("Welcome to XYZ Bank");
			
		
			
			int options;
			
			do {
				System.out.println("Please select the Banking Options");
				System.out.println("*********************");
				System.out.println("1. Deposit");
				System.out.println("2. Withdrawl");
				System.out.println("3. Transfer");
				System.out.print("0, Logout");
				System.out.println("*********************");
				
				options = sc.nextInt(); //0
				
				switch(options) {
				
				case 0:
			//		options = 0;
					break;
					
				case 1:{
				
					banking.deposit();
					
				}
				break;
				case 2:{
					banking.withdrawl();
				}
				break;
				case 3:{
					banking.transfer();
				}
				break;
				
				default:
					System.out.println("enter valid value");
					
				}
				
				
				
			}while(options != 0);
			{
				System.out.println("exited scucessfully");
			}
		}
		
		else {
			System.out.println("Invalid credentails");
		}

	}

}
