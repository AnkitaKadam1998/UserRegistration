import java.util.Scanner;
import java.util.regex.*;

public class UserRegister {

	static String fName;
	static String lName;
	static String email;
	static String pNum;
	static String password;

   
   static String firstName(){
      Scanner str1 = new Scanner(System.in);
      System.out.println("Enter your first name in ('A'nkita) format");
      fName = str1.nextLine();
      return fName;
   }

	
	static String lastName(){
      Scanner str2 = new Scanner(System.in);
      System.out.println("Enter your last name in ('K'adam) format");
      lName = str2.nextLine();
      return lName;
   }
	
	
	static String emailId(){
		Scanner str3 = new Scanner(System.in);
		System.out.println("Enter your email ID in (abc.xyz@bl.co.in): ");
		email = str3.nextLine();
		return email;
	}

	
	static String phoneNum(){
      Scanner str4 = new Scanner(System.in);
      System.out.println("Enter your phone number in (ex- '91 9999999999'): ");
      pNum = str4.nextLine();
      return pNum;
   }

	
	static String passwordCheck(){
      Scanner str5 = new Scanner(System.in);
      System.out.println("Enter your password of atleast 8 characters): ");
      password = str5.nextLine();
      return password;
   } 

   public static void main(String args[]) {
      
      System.out.println("Welcome to User Registration Problem!");

      
      Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.firstName());

		
      Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.lastName());

		
		Boolean emailId = Pattern.matches("^[A-Z a-z 0-9]+([._*+][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]*.[a-z A-Z]{2,3}([.][ a-z A-Z]{2})*$",UserRegister.emailId());
		
		
      Boolean phoneNum = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}" ,UserRegister.phoneNum());

		
      Boolean passwordCheck = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}" ,UserRegister.passwordCheck());

      
      while(firstName == false) {
         System.out.println("Error! Invalid input from user please enter your First-Name in valid format('A'nkita).");
         firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.firstName());
      }

		while(lastName == false) {
         System.out.println("Error! Invalid input from user please enter your Last-Name in valid format('K'adam).");
         lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",UserRegister.lastName());
      }

		while(emailId == false) {
         System.out.println("Error! Invalid input from user please enter your email Id in valid format(ex-'abc.xyz@bl.co.in).");
         lastName = Pattern.matches("^[A-Z a-z 0-9]+([._*+][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]*.[a-z A-Z]{2,3}([.][ a-z A-Z]{2})*$",UserRegister.emailId());
      }
		
		while(phoneNum == false) {
			System.out.println("Error! Invalid input from user please enter your phone number in valid format(ex-'91 9999999999').");
			phoneNum = Pattern.matches("^[9][1] [6-9]{1}[0-9]{9}" ,UserRegister.phoneNum());
		}

		while(passwordCheck == false) {
         System.out.println("Error! Invalid input from user please enter your password in valid format(should contain atleast 8 characters).");
     		passwordCheck = Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}",UserRegister.passwordCheck());
		}

      
		
      System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);
		System.out.println("Email ID: " + email);
		System.out.println("Phone number: +" + pNum);
		System.out.println("Password: " + password);
		
	}
}

