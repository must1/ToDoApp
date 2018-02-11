import java.util.InputMismatchException;
import java.util.Scanner;

public class ToDoEngine {

    private Scanner input = new Scanner(System.in);
    private AccountMaker accountMaker = new AccountMaker();
    private AccountLogger accountLogger = new AccountLogger(accountMaker);
    private boolean loopIsTrue = true;
    private String login, password;
    private Account account = new Account(new Tasker());

    private void inputLoginAndPassword() {
        System.out.println("Input your login");
        login = input.next();

        System.out.println("Input your password");
        password = input.next();
    }

    private void getOptionsOfMainMenu(int option) {
        if (option >= 1 && option <= 2) {
            switch (option) {
                case 1:
                    inputLoginAndPassword();
                    accountMaker.createAccount(login, password);
                    System.out.println("Now let's log into you account.");
                case 2:
                    while (loopIsTrue) {
                        inputLoginAndPassword();
                        if (!accountLogger.isLoginDataIncorrect(login, password)) {
                            loopIsTrue = false;
                        }
                    }
                    break;
            }
        }
    }

    void displayMainMenu() {
        System.out.println("What do you wanna to do?");
        System.out.println("1. Add Account 2. Log into my account");

        while (loopIsTrue) {
            try {
                getOptionsOfMainMenu(input.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("You've inputed something wrong!");
                System.out.println("What do you wanna to do?");
                System.out.println("1. Add Account 2. Log into my account");
                input.next();
            }
        }
    }

    private void getOptionsOfUserMenu(int option) {
        if (option >= 1 && option <= 4) {
            switch (option) {
                case 1:
                    System.out.println("Write down your task.");
                    input.nextLine();
                    account.addNewTask(input.nextLine());
                    System.out.println("Task was added.");
                    break;
                case 2:
                    System.out.println("----------------");
                    System.out.println("YOUR TASK LIST:");
                    account.showAllTasks();
                    System.out.println("----------------");
                    break;
                case 3:
                    System.out.println("Write down your task that you want to delete from task list.");
                    input.nextLine();
                    account.deleteTask(input.nextLine());
                    System.out.println("Task was deleted");
                    loopIsTrue = false;
                    break;
                case 4:
                    loopIsTrue = false;
                    break;
            }
        }
    }

    public void displayUserMenu() {
        loopIsTrue = true;
        while (loopIsTrue) {
            System.out.println("What do you wanna to do?");
            System.out.println("1. Add task 2. Show my tasks 3. Delete task 4. Exit");
            getOptionsOfUserMenu(input.nextInt());
        }
    }
}