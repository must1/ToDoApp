import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private List<String> Tasks = new ArrayList<>();

     User(String login, String password) {
        this.login = login;
        this.password = password;
    }

     List<String> getTasks() {
        return Tasks;
    }

     void setTasks(List<String> tasks) {
        Tasks = tasks;
    }
     String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

}
