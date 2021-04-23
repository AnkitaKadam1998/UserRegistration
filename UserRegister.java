import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ValidationJunit {

	private ValidationJunit() {}

	public static boolean isValidFirstName(String firstName)
	{
		final String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();	
	}
	public static boolean isValidLastName(String lastName)
	{
		final String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();	
	}
	
	public static boolean isValidEmail(String email)
	{
		final String regex = "^[A-Z a-z 0-9]+([._*+][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]*.[a-z A-Z]{2,3}([.][ a-z A-Z]{2})*$";
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();	
	}
	
	public static boolean isValidMobileNumber(String mobilenumber)
	{
		final String regex = "^[9][1] [6-9]{1}[0-9]{9}";
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(mobilenumber);
		return matcher.matches();	
	}
	
	public static boolean isValidPassword(String password)
	{
		final String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}";
		Pattern pattern = Pattern.compile(regex);		
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();	
	}
}

