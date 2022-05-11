package demo10;

public class Helper {

    User[] users;

    public Helper() {
    }

    public Helper(User[] users) {
        this.users = users;
    }

    static void iterator (User[] users) {
        for (User user : users) {
            if (user.age > 20) System.out.println(user);
        }
        System.out.println("---------------------");
    }

    void iterator() {
        for (User user : users) {
            if (user.age > 20) System.out.println(user);
        }
        System.out.println("-----------------------");
    }

}
