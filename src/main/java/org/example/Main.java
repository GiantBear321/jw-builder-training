package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setCountry("Germany")
                .setHorses(500)
                .setName("Mercedes")
                .setYear(1998)
                .setColor(Car.Color.GREEN)
                .build();
        System.out.println(car.toString());
    }
}