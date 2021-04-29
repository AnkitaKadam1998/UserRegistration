package javaprogram;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface InputsOfUsers{
    Boolean check(String regexPattern, String userInput);
}


public class LambdaImplementation {

    static String getInputs(String input) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your " + input);
        String getInput = scan.nextLine();
        return getInput;
    }


    public static void main(String[] args) {

        String first_name = LambdaImplementation.getInputs("First Name");
        String last_name = LambdaImplementation.getInputs("Last Name");
        String email1 = LambdaImplementation.getInputs("Email");
        String mobileNum = LambdaImplementation.getInputs("Mobile Number");
        String pWord = LambdaImplementation.getInputs("Password");

        InputsOfUsers firstName = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        InputsOfUsers lastName = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        InputsOfUsers email = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        InputsOfUsers phoneNumber = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);
        InputsOfUsers password = (regexPattern, userInput) -> Pattern.matches(regexPattern, userInput);

        Boolean fName = firstName.check("^[A-Z]{1}[a-z]{2,}", first_name);
        Boolean lName = lastName.check("^[A-Z]{1}[a-z]{2,}", last_name);
        Boolean eMail = email.check("^[A-Z a-z 0-9]+([._*+][0-9 a-z A-Z]+)*@[0-9 a-z A-Z]*.[a-z A-Z]{2,3}([.][ a-z A-Z]{2})*$", email1);
        Boolean pNum = phoneNumber.check("^[9][1] [6-9]{1}[0-9]{9}", mobileNum);
        Boolean passWord = password.check("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}", pWord);

        System.out.println("Validation for user input firstName is " + fName);
        System.out.println("Validation for user input lastName is " + lName);
        System.out.println("Validation for user input email is " + eMail);
        System.out.println("Validation for user input phoneNumber is " + pNum);
        System.out.println("Validation for user input password is " + passWord);
    }
}
