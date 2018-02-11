public class AccountLogger {
    private AccountMaker accountMaker;

    AccountLogger(AccountMaker accountMaker) {
        this.accountMaker = accountMaker;
    }

    boolean isLoginDataIncorrect(String login, String password) {
        Account account = accountMaker.getLoginDetails().get(login);

        if (account != null && account.getPassword().equals(password)) {
            System.out.println("You've logged in.");
            return false;
        } else {
            System.out.println("Bad login or password");
        }

        return true;
    }
}