package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = - 1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = // ???
            }
            if (rsl == - 1) {
                throw new ElementNotFoundException("Could not find index");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(value, rsl); // ???
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
