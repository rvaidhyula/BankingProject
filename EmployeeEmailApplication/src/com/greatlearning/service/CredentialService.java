package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.EmployeeDetails;

public class CredentialService {
	//Generate password for generating random password
	
	public char[] generatePassword() {
		
		String strCapitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strSmallLetters = "abcdefghijklmnopqrstuvwxyz";
		String strNumbers = "0123456789";
		String StrSpCharcters = "!@#$%^&*()_+-=";
		
		String strValues = strCapitalLetters+strSmallLetters+strNumbers+StrSpCharcters;
		
		Random rd = new Random();
		
		char [] password = new char[8];
		for(int i=0;i<8;i++) { //from 62 it will generate one number 7,12
			password[i] = strValues.charAt(rd.nextInt(strValues.length())); 
			//value Captial H //store in zero position,Value Captial M , store in 1 positon  password[HMa!!]
		}
				
		return password;
		
	}
	
	public String generateMailId(String strFirstName,String strLastName,String strDepartment)
	{
		String strEmailId = strFirstName + strLastName+"@"+strDepartment+".abc.com";
		
		return strEmailId;
	}
	
	public void showCredentials(EmployeeDetails empDetails, String strEmailId,char[] password) {
		
		System.out.println("Dear  " + empDetails.getStrFirstName()+ " "+ empDetails.getStrLastName() + " yours email Generated");
		
		System.out.println ("Email Id " + strEmailId);
		
		System.out.println ("Password >>>");
		
		System.out.println(password);
	}
	
	
	
	
	
	

}
