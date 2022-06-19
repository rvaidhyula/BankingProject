package mailmain;

import java.util.Scanner;

import com.greatlearning.model.EmployeeDetails;
import com.greatlearning.service.CredentialService;

public class MailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] password;
		
		String strGenerateEmailId;
		Scanner sc = new Scanner(System.in);
		String strFirstName ;
		String strLastName;
		System.out.println("Enter your First Name");
		strFirstName = sc.nextLine();
		System.out.println("Enter your Last Name");
		
		strLastName = sc.nextLine();
		
		CredentialService credentialService = new CredentialService();
		
		EmployeeDetails empDetails = new EmployeeDetails(strFirstName,strLastName);
		
		
		System.out.println("Select Department from below options");
		
		System.out.println("1. Technical");
		
		System.out.println("2. Admin");
		
		System.out.println("3. HR");
		
		System.out.println("4. Legal");
		
		int options = sc.nextInt();
	
		
		if(options == 1) {
			
			strGenerateEmailId = credentialService.generateMailId(empDetails.getStrFirstName(), empDetails.getStrLastName(), "Technical");
			password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, password);
			
		}
		else if(options == 2)
		{
			strGenerateEmailId = credentialService.generateMailId(empDetails.getStrFirstName(), empDetails.getStrLastName(), "Admin");
			password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, password);
		}
		else if(options == 3) {
		strGenerateEmailId = credentialService.generateMailId(empDetails.getStrFirstName(), empDetails.getStrLastName(), "T"
				+ "HR");
		password = credentialService.generatePassword();
		credentialService.showCredentials(empDetails, strGenerateEmailId, password);
		
		}
		
		else if(options == 4) {
			strGenerateEmailId = credentialService.generateMailId(empDetails.getStrFirstName(), empDetails.getStrLastName(), "T"
					+ "Legal");
			password = credentialService.generatePassword();
			credentialService.showCredentials(empDetails, strGenerateEmailId, password);
			
			}
		
		else {
			
			System.out.println("Please enter Valid option");
		}
		
		sc.close();
			
	}

}
