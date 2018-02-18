import java.util.HashMap;

public class AccountMaker {
    private HashMap<String, Account> loginDetails = new HashMap<>();

    Account createAccount(String login, String password) {
        Account newUser = new Account(login, password);
        System.out.println("Account has been created successfully");
        return loginDetails.put(login, newUser);
    }

    HashMap<String, Account> getLoginDetails() {
        return loginDetails;
    }
}