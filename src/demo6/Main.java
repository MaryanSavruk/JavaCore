package demo6;

public class Main {
    public static void main(String[] args) {

        User kokos = new User(1, "Kokos", 21, 10000);
        User abrykos = new User(1, "Abrykos", 22, 9000);
        User tomat = new User(3, "tomat", 35, 30000);

        String result;

        boolean b = kokos.age > abrykos.age;
        if (b) {
            result = "kokos is older";
        } else {
            result = "abrykos is older";
        }
//        System.out.println(result);
    }
}
