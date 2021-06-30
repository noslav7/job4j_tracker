package ru.job4j.tracker;

import com.sun.jdi.connect.Connector;
import org.junit.Test;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {

    @Test
    public void whenAddItem() {
    Input input = new ConsoleInput();
    Tracker tracker = new Tracker();
    StartUI.createItem(input, tracker);
    Item created = tracker.findAll()[0];
    Item expected = new Item("Fix PC");
    assertThat(created.getName(), is(expected.getName()));
    }
}