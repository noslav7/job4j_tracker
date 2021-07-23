package ru.job4j.set;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class UniqueName {
    public static int collectUniqueName(List<User> users) {
        HashSet<User> names = new HashSet<>();
        for (User user : users) {
            names.add(user);
        }
        return (users.size() - names.size()) * 2;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
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
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
