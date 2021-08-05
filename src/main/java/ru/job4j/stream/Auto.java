package ru.job4j.stream;

public class Auto {
    private String manufacturer;

    private String model;

    private int yearOfProduction;

    private String color;

    private String countryOfProduction;

    private boolean damaged;

    private String type;

    @Override
    public String toString() {
        return "UserUser{"
                + "name='" + manufacturer + '\''
                + ", surname='" + model + '\''
                + ", age=" + yearOfProduction + ", login='" + color + '\''
                + ", password='" + countryOfProduction + '\''
                + ", activated=" + damaged + ", gender='" + type + '\''
                + '}';
    }

    static class Builder {
        private String manufacturer;

        private String model;

        private int yearOfProduction;

        private String color;

        private String countryOfProduction;

        private boolean damaged;

        private String type;

        Builder buildManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildCountryOfProduction(String countryOfProduction) {
            this.countryOfProduction = countryOfProduction;
            return this;
        }

        Builder buildDamaged(boolean damaged) {
            this.damaged = damaged;
            return this;
        }

        Builder buildType(String type) {
            this.type = type;
            return this;
        }

        Auto build() {
            Auto auto = new Auto();
            auto.manufacturer = manufacturer;
            auto.model = model;
            auto.yearOfProduction = yearOfProduction;
            auto.color = color;
            auto.countryOfProduction = countryOfProduction;
            auto.damaged = damaged;
            auto.type = type;
            return auto;
        }
    }

    public static void main(String[] args) {
        Auto auto = new Builder().buildManufacturer("Toyota")
                .buildModel("Auris")
                .buildYearOfProduction(2010)
                .buildColor("brown")
                .buildCountryOfProduction("UK")
                .buildDamaged(false)
                .buildType("C")
                .build();
        System.out.println(auto);
    }
}
