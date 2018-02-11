public class Account {
    private Tasker tasker;
    private String login;
    private String password;

    Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private Account(Tasker tasker) {
        this.tasker = tasker;
    }

    void addNewTask(String task) {
        tasker.createTask(task);
    }

    void deleteTask(String task) {
        tasker.deleteTask(task);
    }

    void showAllTasks() {
        tasker.showAllTasks();
    }

    String getPassword() {
        return password;
    }
}
