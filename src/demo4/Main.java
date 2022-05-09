package demo4;

import demo2.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(2, "kokos", "2222", (byte) 21, "man", 67.6F, 176.1, true, '*');
        User user2 = new User(10, "abrikos", "1234", (byte) 34, "woman", 47.6F, 166.1, true, '^');

        double result = (double) user1.age / user2.age;
        System.out.println(result);

        System.out.println(user1.age + user2.age + user1.sex);
        System.out.println(user1.sex + user1.age + user2.age);
        System.out.println(user1.sex + (user1.age + user2.age));
    }
}
