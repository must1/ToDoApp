import java.util.HashMap;
import java.util.Scanner;

public class AccountLogger {

    private AccountMaker accountMaker;
    private Scanner input = new Scanner(System.in);
    private String login, password;

    public AccountLogger(AccountMaker accountMaker) {
        this.accountMaker = accountMaker;
    }




    void inputLoginAndPassword() {
        System.out.println("Input your login");
        login = input.next();

        System.out.println("Input your password");
        password = input.next();
    }

    boolean checkIfLoginDataIsIncorrect() {
        if (accountMaker.getLoginDetails().containsKey(login) && accountMaker.getLoginDetails().get(login).equals(password)) {
            System.out.println("You've logged in.");
            return false;
        }
        else
            System.err.println("Bad login or password");
        return true;
    }
}