package demo7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fighter fighter = null;
        System.out.println("Choose your fighter");

        String key = new Scanner(System.in).nextLine();
        switch (key) {
            case "one":
                fighter = new Fighter("sub-zero", 100);
                break;
            case "two":
                fighter = new Fighter("scorpion", 200);
                break;
            default:
                fighter = new Fighter("shoa-khan", 200);
        }
        System.out.println(fighter);
    }
}
