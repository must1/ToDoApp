import java.util.HashMap;

public class AccountMaker {
    private HashMap<String, Account> loginDetails = new HashMap<>();

    void createAccount(String login, String password) {
        Account newUser = new Account(login, password);
        loginDetails.put(login, newUser);
        System.out.println("Account has been created successfully");
    }

    HashMap<String, Account> getLoginDetails() {
        return loginDetails;
    }
}