package ru.job4j.tracker;

public class UIStart {
    public static void main(String[] args) {
        Log4File log = Log4File.getInstance();
        log.add("add new Item");
        log.save();
    }
}
