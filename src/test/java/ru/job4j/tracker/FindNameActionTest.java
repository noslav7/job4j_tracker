package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindNameActionTest {

    @Test
    public void execute() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New Item"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );

        UserAction[] actions = {
                new FindNameAction(output),
                new Exit(output)
        };
        String ln = System.lineSeparator();
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit" + ln
                        + "=== Find items by name ====" + ln
                        + item + ln
                        + "Menu." + ln
                        + "0. Find item by name" + ln
                        + "1. Exit" + ln
        ));
    }
}
