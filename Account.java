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

    boolean createTask(String task) {
        return listOfTasks.add(task);
    }

    boolean deleteTask(String task) {
        return listOfTasks.remove(task);
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
