package ru.job4j.comparator;


import java.util.Comparator;
import java.util.Objects;

public class ThenComparingMethod {

    public static class User implements Comparator<User> {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compare(User o1, User o2) {
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

    }

    public static Comparator<User> thenComparing() {
        return Comparator.comparing(User::getName).thenComparing(Comparator.comparing(User::getAge).reversed());
    }

    public static Comparator<User> ascByName() {
        return Comparator.comparing(User::getName);
    }

    public static Comparator<User> descByAge(User o1, User o2) {
        return Comparator.comparing(User::getAge).reversed();
        }
    }
