import java.util.HashMap;
import java.util.Scanner;

public class AccountLogger {
    private AccountMaker accountMaker = new AccountMaker();
    private Scanner input = new Scanner(System.in);
    HashMap<String, String> loginDetails = accountMaker.getLoginDetails();
    private String login, password;



    void inputLoginAndPassword() {
        System.out.println("Input your login");
        login = input.next();

        System.out.println("Input your password");
        password = input.next();
    }

    boolean checkIfLoginDataIsIncorrect(HashMap<String, String> loginDetails2) {
       
        System.out.println(login);
        System.out.println(password);
        // Assinging loginDetails = loginDetails Hashmap from Main Cls. 
        // This is becuase the Hashmap in two classes are different. Even you have same name, they belong to different classes. 
        //So object memory allocations and elements are not same. Learn more on scope, instances and passing arguments in java.
        loginDetails = loginDetails2;
        if (loginDetails.containsKey(login) && loginDetails.get(login).equals(password)) {
            System.out.println("You've logged in.");
            return false;
        }
        else
            System.err.println("Bad login or password");
        return true;
    }
}
