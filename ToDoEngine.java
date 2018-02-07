import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoEngine {


    private Scanner input = new Scanner(System.in);
    private AccountMaker accountMaker = new AccountMaker();
    private AccountLogger accountLogger = new AccountLogger(accountMaker);
    private boolean loopIsTrue = true;

    public void startToDoApp() {

        System.out.println("What do you wanna to do?");
        System.out.println("1. Add Account 2. Log into my account");

        while (loopIsTrue) {
            try {
                displayMainMenu(input.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("You've inputed something wrong!");
                System.out.println("What do you wanna to do?");
                System.out.println("1. Add Account 2. Log into my account");
                input.next();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void displayMainMenu(int option) throws InterruptedException {
        if (option >= 1 && option <= 2) {
            switch (option) {
                case 1:
                    accountMaker.inputLoginAndPassword();
                    accountMaker.createAccount();
                    System.out.println("Now let's log into you account.");
                case 2:
                    while (loopIsTrue) {
                        accountLogger.inputLoginAndPassword();
                        if (!accountLogger.isLoginDataIncorrect()) {
                            loopIsTrue = accountLogger.isLoginDataIncorrect();
                        }
                    }
                    break;
            }
        }
    }
}