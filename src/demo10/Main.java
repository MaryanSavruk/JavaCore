package demo10;

public class Main {
    public static void main(String[] args) {

        User[] boys = {
                new User("Vasya", 21),
                new User("Petya", 25),
                new User("Max", 19),

        };

        User[] vegetables = {
                new User("Kokos", 222),
                new User("abrykos", 254),
                new User("tomat", 194),

        };

        User[] girls = {
                new User("Anya", 19),
                new User("Olya", 21),
                new User("Masha", 20),

        };

//        Helper helper = new Helper();
//        helper.iterator(boys);
//        helper.iterator(vegetables);
//        helper.iterator(girls);
        Helper.iterator(boys);
        Helper.iterator(vegetables);
        Helper.iterator(girls);


    }
}
