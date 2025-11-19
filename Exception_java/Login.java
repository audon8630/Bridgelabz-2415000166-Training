import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class LoginSystem {
    private String validUser = "admin";
    private String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        } else {
            System.out.println("Login successful!");
        }
    }
}

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginSystem login = new LoginSystem();

        try {
            System.out.print("Enter username: ");
            String user = sc.nextLine();
            System.out.print("Enter password: ");
            String pass = sc.nextLine();

            login.validate(user, pass);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
            System.out.println("Please try again.");
        }
    }
}
