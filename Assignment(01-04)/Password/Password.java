package Password;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        System.out.println("Password should be a minimum of 8 characters in length.");
        System.out.println("Password should contain at least one uppercase, one lowercase, one digit, and one special character.");
        System.out.println("Special characters allowed: !@#$%^&*()-_=+[{]}\\|;:'\",<.>/?");
        System.out.println("It should not contain white space.");
        String password = scanner.nextLine();
        int length = password.length();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        boolean hasWhiteSpace = false;
        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (isSpecialCharacter(ch)) {
                hasSpecialCharacter = true;
            } else if (Character.isWhitespace(ch)) {
                hasWhiteSpace = true;
            }
        }
        if (length >= 8 && hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter && !hasWhiteSpace) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        scanner.close();
    }
  public static boolean isSpecialCharacter(char ch) {
        String specialCharacters = "!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
        return specialCharacters.indexOf(ch) != -1;
    }
}