package origin;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class Login_General extends Sign_In{
	
	
	@Override
	public void login_information() {
		
		File file = new File("General Signing In Informations");
		file.mkdir();	
	
	do {
		
	try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/General Signing In Informations/General User Signing In Information - 1.txt");
			
		String User_Name = super.User_Name;
		String Password = super.Password;
		String confirm = super.confirm;
		String agree = super.agree;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("User Name: ");
		super.User_Name = input.nextLine();
		store.format("User Name: "+super.User_Name);
		
		System.out.print("Password: ");
		super.Password = input.nextLine();
		store.format("\r\nPassword: "+super.Password);
		
		System.out.println("");
		
		System.out.print("Confirm ['Yes' / 'No'] ?: = ");
		super.confirm = input.nextLine();
		store.format("\r\nConfirmed: "+super.confirm);
		
		store.close();
		
	}
	
	catch(Exception e) {
		
		System.out.println("Error: "+e);
	}
	
	finally {

		
		if(super.Password.equals("IoWa13") && super.confirm.equalsIgnoreCase(super.agree)) {
			  
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t\tWELCOME, "+super.User_Name);
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
			Login_General.status = 1;
		}
	
		
		else if(super.Password != ("IoWa13") && super.confirm.equalsIgnoreCase(super.agree)) {
			
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t   *****PASSWORD MISMATCHED*****");
			System.out.println("		  Please login credentials.");
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
		}
		
	}
}
	while(Login_General.status == 0);

}
			
	@Override
	public void login_information1() {
		
		File file = new File("General Signing In Information");
		file.mkdir();	
	
	do {
		
	try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/General Signing In Informations/General User Signing In Information - 2.txt");
			
		String User_Name = super.User_Name;
		String Password = super.Password;
		String confirm = super.confirm;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("User Name: ");
		super.User_Name = input.nextLine();
		store.format("User Name: "+super.User_Name);
		
		System.out.print("Password: ");
		super.Password = input.nextLine();
		store.format("\r\nPassword: "+super.Password);
		
		System.out.println("");
		
		System.out.print("Confirm ['Yes' / 'No'] ?: ");
		super.confirm = input.nextLine();
		store.format("\r\nConfirmed: "+super.confirm);
		
		store.close();
	}
	
	catch(Exception e) {
		
		System.out.println("Error: "+e);
	}
	
	finally {

		
		if(super.Password.equals("Latte0145") && super.confirm.equalsIgnoreCase(super.agree)) {
			  
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t\tWELCOME, "+super.User_Name);
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
			Login_General.status = 1;
		}
	
		
		else if(super.Password != ("Latte0145") && super.confirm.equalsIgnoreCase(super.agree)) {
			
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t   *****PASSWORD MISMATCHED*****");
			System.out.println("		  Please login credentials.");
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
		}
		
	}
}
	
	while(Login_General.status == 0);

}
				
	@Override
	public void login_information2() {
		
		File file = new File("General Signing In Information");
		file.mkdir();	
	
	do {
		
	try {
			
		Formatter store = new Formatter("F:/Work and Projects/Women Ride Sharing Management System/General Signing In Informations/General User Signing In Information - 3.txt");
			
		String User_Name = super.User_Name;
		String Password = super.Password;
		String confirm = super.confirm;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("User Name: ");
		super.User_Name = input.nextLine();
		store.format("User Name: "+super.User_Name);
		
		System.out.print("Password: ");
		super.Password = input.nextLine();
		store.format("\r\nPassword: "+super.Password);
		
		System.out.println("");
		
		System.out.print("Confirm ['Yes' / 'No'] ?: = ");
		super.confirm = input.nextLine();
		store.format("\r\nConfirmed: "+super.confirm);
		
		store.close();
		
	}
	
	catch(Exception e) {
		
		System.out.println("Error: "+e);
	}
	
	finally {

		
		if(super.Password.equals("Coco786") && super.confirm.equalsIgnoreCase(super.agree)) {
			  
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t\tWELCOME, "+super.User_Name);
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
			Login_General.status = 1;
		}
	
		
		else if(super.Password != ("Coco786") && super.confirm.equalsIgnoreCase(super.agree)) {
			
			System.out.println("");
			System.out.println("\t--------------------------------------------------");
			System.out.println("\t\t   *****PASSWORD MISMATCHED*****");
			System.out.println("		  Please login credentials.");
			System.out.println("\t--------------------------------------------------");
			System.out.println("");
			
		}
		
	}
}
	while(Login_General.status == 0);

}
	
}