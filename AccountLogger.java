import java.util.HashMap;
import java.util.Scanner;

public class AccountLogger {
    private AccountMaker accountMaker = new AccountMaker();
    private Scanner input = new Scanner(System.in);
    private boolean loopIsTrue = true;
    private HashMap<String, String> loginDetails = accountMaker.getLoginDetails();
    private String login, password;


    void inputLoginAndPassword() {
        System.out.println("Input your login");
        login = input.next();

        System.out.println("Input your password");
        password = input.next();
    }

    void checkIfLoginDataIsCorrect() {
        while (loopIsTrue) {
            if (loginDetails.containsKey(login)
                    && loginDetails.get(password).equals(password)) {
                loopIsTrue = false;
            } else {
                System.err.println("You've inputed bad login or password!");
                loopIsTrue = true;
            }
        }
    }
}