package demo8;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println("done" + i);
            i++;
        }

        for (int min = 1; min <=3; min++) {

            for (int sec = 0; sec < 60; sec++) {

                System.out.println("min " + min + "sec " + sec);

            }
        }

        do {
            System.out.println("something");
        } while (false);
    }
}
