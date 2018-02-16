import java.util.ArrayList;
import java.util.List;

public class Account {
    private String login;
    private String password;
    private List<String> listOfTasks = new ArrayList<>();

    Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    Account() {
    }

    void createTask(String task) {
        listOfTasks.add(task);
    }

    void deleteTask(String task) {
        listOfTasks.remove(task);
    }

    void showAllTasks() {
        for (String listOfTask : listOfTasks) {
            System.out.println(listOfTask);
        }
    }

    String getPassword() {
        return password;
    }
}
