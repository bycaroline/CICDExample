package org.carolineeklund;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car1 = new Car(0, "red");
        Car car2 = new Car(0, "blue");

        System.out.println(car1.accelerate(10));
        System.out.println(car2.accelerate(20));
    }


}