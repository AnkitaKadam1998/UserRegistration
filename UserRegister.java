import java.util.Scanner;
import java.util.regex.*;

public class UserRegister 
{
	static String email;
	
	static String email()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Email ID:");
		email=scan.nextLine();
		return email;
		
	}
	
	public static void main(String args[])
	{
		System.out.println("Welcome to User Registration Problem");
		
		Boolean email = Pattern.matches("^[A-Z a-z 0-9]+([._*+][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]*.[a-z A-Z]{2,3}([.][ a-z A-Z]{2})*$",UserRegister.email());
		
		while(email == false)
		{
			System.out.println("Error ! Invalid input from user please enter your Email id in valid format('ankita80kadam@gmail.com')");
			email = Pattern.matches("^[A-Z a-z 0-9]+([._*+][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]*.[a-z A-Z]{2,3}([.][ a-z A-Z]{2})*$",UserRegister.email());
		}
		System.out.println("Email ID :" +email);
	}
}

