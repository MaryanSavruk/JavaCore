package demo8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int i = 0;
//        while (i < 10) {
//            System.out.println("done" + i);
//            i++;
//        }
//        for (int min = 1; min <=3; min++) {
//            for (int sec = 0; sec < 60; sec++) {
//                System.out.println("min " + min + "sec " + sec);
//            }
//        }
//
//        do {
//            System.out.println("something");
//        } while (false);

    Car car1 = new Car("e300", 3.0, 240);
    Car car2 = new Car("200", 2.2, 240);
    Car car3 = new Car("legacy", 3.0, 251);
    Car car4 = new Car("legacy", 2.0, 165);
    Car car5 = new Car("x6", 5.0, 360);
    Car car6 = new Car("321i", 2.1, 160);
    Car car7 = new Car("x6", 6.0, 398);

//    Car [] cars = {car1, car2, car3, car4, car5, car6, car7};
////        System.out.println(cars.length);
////        System.out.println(cars);
//        for (Car car : cars) {
//            System.out.println(car);
//        }

    Car[] cars = new Car[7];
    cars[0] = car1;
    cars[1] = car2;
    cars[2] = car3;
    cars[3] = car4;
    cars[4] = car5;
    cars[5] = car6;
    cars[6] = car7;

//        for (Car car : cars) {
////            System.out.println(car);
//            if (car.power > 170){
//                System.out.println(car);
//            }
//        }

    Car[] cars2 = new Car[100];
        for (int i = 0, j = 0; i < cars.length; i++) {
            Car car = cars[i];
            if (car.power > 170) {
                cars2[j] = car;
                j++;
            }
        }

        System.out.println(Arrays.toString(cars2));









    }
}
