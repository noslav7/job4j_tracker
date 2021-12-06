package ru.job4j.map;
import java.util.*;

public  class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        for (Info i: list) {
            int rain = 0;
            for (Info j : list) {
                if (i.city.equals(j.city)) {
                    rain += j.rainfall;
                }
            }
            Info oneInfo = new Info(i.city, rain);
            if (!rsl.contains(oneInfo)) {
                rsl.add(oneInfo);
            }
        }
        rsl.sort(Comparator.comparing(Info::getRainfall));
        rsl.add(0, rsl.remove(3));
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
