package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ShowActionTest {

    @Test
    public void execute() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("New Item"));
        Input in = new StubInput(
                new String[] {"0", "1"}
        );

        UserAction[] actions = {
                new ShowAction(output),
                new Exit(output)
        };
        String ln = System.lineSeparator();
        new StartUI(output).init(in, tracker, Arrays.asList(actions));
        assertThat(output.toString(), is(
                "Menu:" + ln
                + "0. Show all Items" + ln
                + "1. Exit" + ln
                + "=== Show all items ====" + ln
                + item + ln
                + "Menu:" + ln
                + "0. Show all Items" + ln
                + "1. Exit" + ln
        ));
    }
}