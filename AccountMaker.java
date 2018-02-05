import java.util.HashMap;
import java.util.Scanner;

public class AccountMaker {

    private HashMap<String, String> loginDetails = new HashMap<>();
    private Scanner input = new Scanner(System.in);
    private String login, password;

    void createAccount() throws InterruptedException {
        System.out.println("Input your login");
        login = input.next();

        System.out.println("Input your password");
        password = input.next();

        loginDetails.put(login, password);
        System.out.println("Account has been created successfully");
        Thread.sleep(2000);
    }

    public HashMap<String, String> getLoginDetails() {
        return loginDetails;
    }

}
