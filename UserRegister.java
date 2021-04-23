import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class ValidationUnitTest {
	
	@Test
	public void testFirstName_shouldReturnTrue()
	{
		String firstName= "Ankita";
		boolean isValidFirstName = ValidationJunit.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}
	
	@Test
	public void testFirstName_shouldReturnFalse()
	{
		String firstName= "ankita";
		boolean isValidFirstName = ValidationJunit.isValidFirstName(firstName);
		assertFalse(isValidFirstName);
	}
	
	@Test
	public void testLastName_shouldReturnTrue()
	{
		String lastName= "Kadam";
		boolean isValidLastName = ValidationJunit.isValidFirstName(lastName);
		assertTrue(isValidLastName);
	}
	
	@Test
	public void testLastName_shouldReturnFalse()
	{
		String lastName= "kadam";
		boolean isValidLastName = ValidationJunit.isValidLastName(lastName);
		assertFalse(isValidLastName);
	}
	
	@Test
	public void testEmail_ShouldReturnTrue()
	{
		String email="xyz@gmail.com";
		boolean isValidEmail = ValidationJunit.isValidEmail(email);
		assertTrue(isValidEmail);
	}
	
	@Test
	public void testEmail_shouldReturnFalse()
	{
		String email= "xyz@gmail..com";
		boolean isValidEmail = ValidationJunit.isValidLastName(email);
		assertFalse(isValidEmail);
	}
	
	@Test
	public void testMobileNumber_ShouldReturnTrue()
	{
		String mobilenumber="91 9999876479";
		boolean isValidMobileNumber = ValidationJunit.isValidMobileNumber(mobilenumber);
		assertTrue(isValidMobileNumber);
	}
	
	@Test
	public void testMobileNumber_ShouldReturnFalse()
	{
		String mobilenumber="9999876479";
		boolean isValidMobileNumber = ValidationJunit.isValidMobileNumber(mobilenumber);
		assertFalse(isValidMobileNumber);
	}
	
	@Test
	public void testPassword_ShouldReturnTrue()
	{
		String password="Xyz@12345";
		boolean isValidPassword = ValidationJunit.isValidPassword(password);
		assertTrue(isValidPassword);
	}
	
	@Test
	public void testPassword_ShouldReturnFalse()
	{
		String password="xyz";
		boolean isValidPassword = ValidationJunit.isValidMobileNumber(password);
		assertFalse(isValidPassword);
	}

}


