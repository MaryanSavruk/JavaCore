package demo5;

public class Main {
    public static void main(String[] args) {

        User kokos = new User(1, "Kokos", 21, 10000);
        User abrykos = new User(1, "Abrykos", 22, 9000);
        boolean result = kokos.age > abrykos.age;
        System.out.println(result);
        result = kokos.cash > abrykos.cash;
        System.out.println("result = " + result);

        String a = "oktenweb";
        String b = "oktenweb";
        System.out.println(a == b);

        String a1 = "oktenweb";
        String b1 = new String("oktenweb");
        System.out.println(a1 == b1);

        String a2 = "oktenweb";
        String b2 = new String("oktenweb");
        System.out.println("a equals b? - " + a2.equals(b2));


    }
}
