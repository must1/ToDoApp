import java.util.HashMap;
import java.util.Scanner;

public class AccountMaker {

    private HashMap<String, String> loginDetails = new HashMap<>();
    private String login, password;
    private Scanner input = new Scanner(System.in);

    void inputLoginAndPassword() {
        System.out.println("Input your login");
        login = input.next();

        System.out.println("Input your password");
        password = input.next();
    }

    void createAccount() throws InterruptedException {
        loginDetails.put(login, password);
        System.out.println("Account has been created successfully");
        Thread.sleep(2000);
    }

    HashMap<String, String> getLoginDetails() {
        return loginDetails;
    }

}
