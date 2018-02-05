import java.util.HashMap;
import java.util.Scanner;

public class AccountLogger {
    private AccountMaker accountMaker = new AccountMaker();
    private Scanner input = new Scanner(System.in);
    private String login, password;
    private boolean isTrue = true;
    HashMap<String, String> loginDetails = accountMaker.getLoginDetails();

    void logIntoAccount() {
        while (isTrue) {
            System.out.println("Input your login");
            login = input.next();

            System.out.println("Input your password");
            password = input.next();

            if (loginDetails.containsKey(login)
                    && loginDetails.get(login).equals(password)) {
                break;
            } else {
                isTrue = true;
            }
        }
        System.out.println("You've been logged in.");
    }


}