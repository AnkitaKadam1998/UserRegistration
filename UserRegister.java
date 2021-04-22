import java.util.Scanner;
import java.util.regex.*;

public class UserRegister 
{
	static String lName;
	
	static String lastName()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Last name:");
		lName=scan.nextLine();
		return lName;
		
	}
	
	public static void main(String args[])
	{
		System.out.println("Welcome to User Registration Problem");
		
		Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.lastName());
		
		while(lastName == false)
		{
			System.out.println("Error ! Invalid input from user please enter your Last-Name in valid format('K'adam)");
			lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.lastName());
		}
		System.out.println("Last Name :" +lName);
	}
}

