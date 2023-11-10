package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void carBuilderSetFields_Ok() {
        String name = "Mercedes";
        int year = 1999;
        int horses = 100;
        Car.Color color = Car.Color.GREEN;

        Car car = new Car.Builder().setHorses(horses).setColor(color).setName(name).setYear(year).build();

        Assertions.assertEquals(name, car.getName());
        Assertions.assertEquals(year, car.getYear());
        Assertions.assertEquals(horses, car.getHorses());
        Assertions.assertEquals(color, car.getColor());
    }

    @Test
    void carBuilderNotValidYear_NotOk() {
        String name = "Mercedes";
        int year = 500;

        Assertions.assertThrows(RuntimeException.class, () -> {
            Car car = new Car.Builder().setName(name).setYear(year).build();
        });
    }

    @Test
    void carBuilderNotValidHorses_NotOk() {
        String name = "Mercedes";
        int horses = -300;

        Assertions.assertThrows(RuntimeException.class, () -> {
            Car car = new Car.Builder().setName(name).setHorses(horses).build();
        });
    }
}