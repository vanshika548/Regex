package RegularExpression;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistrationValidation {
	
	static boolean validateFirstName(String firstName) {
		return firstName.matches( "^[A-Z]{1}[a-z]{2,}$" );
	}
	
	static boolean validateLastName(String lastName) {
		return lastName.matches( "^[A-Z]{1}[a-z]{2,}$" );
	}
	
	static boolean validateMobileNumber(String mobileNumber) {
		return mobileNumber.matches("");
	}
	
	static boolean validatePassword(String password) {
		return password.matches( "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8}$");
	}
	
	public static void main(String[]args) {
		//password 8 char atleat one upper one numberic
		//1 special char 
		System.out.println("Enter full user registration details:");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		System.out.println("Enter last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter mobile number:");
		String mobileNumber = sc.nextLine();
		System.out.println("Enter password:");
		String password = sc.nextLine();
		System.out.println(firstName+": "+validateFirstName(firstName));
		System.out.println(lastName+": "+validateLastName(lastName));
		System.out.println(mobileNumber+": "+validateMobileNumber(mobileNumber));
		System.out.println(password+": "+validatePassword(password));
	}
}
