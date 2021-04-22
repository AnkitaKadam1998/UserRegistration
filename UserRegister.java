import java.util.Scanner;
import java.util.regex.*;

public class UserRegister 
{
	static String fName;
	
	static String firstName()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Fisrt name:");
		fName=scan.nextLine();
		return fName;
		
	}
	
	public static void main(String args[])
	{
		System.out.println("Welcome to User Registration Problem");
		
		Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.firstName());
		
		while(firstName == false)
		{
			System.out.println("Error ! Invalid input from user please enter your First-Name in valid format('A'nkita)");
			firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.firstName());
		}
		System.out.println("Fisrt Name :" +fName);
	}
}

