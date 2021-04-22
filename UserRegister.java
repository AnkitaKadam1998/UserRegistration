import java.util.Scanner;
import java.util.regex.*;

public class UserRegister 
{
	static String mobileNumber;
	
	static String mobileNumber()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mobile Number:");
		mobileNumber=scan.nextLine();
		return mobileNumber;
		
	}
	
	public static void main(String args[])
	{

		System.out.println("Welcome to User Registration Problem");
		
		Boolean mobileNumber = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}",UserRegister.mobileNumber());
		
		while(mobileNumber == false)
		{
			System.out.println("Error ! Invalid input from user please enter your mobile number in valid format(91 9999999999)");
			mobileNumber = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}",UserRegister.mobileNumber());
		}
		System.out.println("Mobile Number :" + mobileNumber);
	}
}

