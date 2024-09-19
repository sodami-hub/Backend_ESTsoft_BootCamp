package chapter06.car.Example;

import chapter06.car.Car;

public class SportsCar extends Car {
    SportsCar(String color) {
        super(color);
    }

    public static void main(String[] args) {
        Car car01 = new SportsCar("blue");
        car01.model="kia";
        /*
        car01.color="ddddd";
        System.out.println("car01.color = " + car01.color);
        */

        SportsCar car03 = (SportsCar)car01;

        System.out.println(car03.color);
        System.out.println();



        SportsCar car02 = new SportsCar("aa");
        car02.color ="white";
        car02.model ="hyundai";
        System.out.println(car02.color+" "+car02.model);
    }
}
