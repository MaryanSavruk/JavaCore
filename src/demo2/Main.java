package demo2;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.id = 1;
        u1.login = "john";
        u1.password = "1111";
        u1.age = 31;
        u1.sex = "man";
        u1.weight = 70.5F;
        u1.height = 188.9;
        u1.isActive = true;
        u1.special = '$';


        System.out.println(u1);
        System.out.println(u1.sex);
        System.out.println(u1.age);
        System.out.println(u1.height);
        System.out.println(u1.isActive);

        User user1 = new User(12, "Vova", "qwerty", (byte) 21, "man", 76.9F,
                    167.9, true, '+'){

        };

        System.out.println(user1);
    }
}
