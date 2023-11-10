package org.example;

public class Car {
    private String name;
    private Color color;
    private int year;
    private int horses;
    private String country;

    private Car(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.country = builder.country;
        this.year = builder.year;
        this.horses = builder.horses;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", horses=" + horses +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private Color color;
        private int year;
        private int horses;
        private String country;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder setYear(int year) {
            if (year < 1900 || year > 2023) {
                throw new RuntimeException("Wrong year, please use valid data");
            }
            this.year = year;
            return this;
        }

        public Builder setHorses(int horses) {
            if (horses <= 0) {
                throw new RuntimeException("Wrong power, please use valid data");
            }
            this.horses = horses;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    public enum Color {
        RED,
        YELLOW,
        BLACK,
        WHITE,
        GREEN,
        GREY
    }

}
