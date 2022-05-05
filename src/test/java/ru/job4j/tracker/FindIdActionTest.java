package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FindIdActionTest {

    @Test
    public void execute() {
        /*
        Output output = new StubOutput();
        Store store = new SqlTracker();
        Item item = store.add(new Item("New Item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );

        UserAction[] actions = {
                new FindIdAction(output),
                new Exit(output)
        };
        String ln = System.lineSeparator();
        new StartUI(output).init(in, store, Arrays.asList(actions));
        assertThat(output.toString(), is(
                "Menu:" + ln
                        + "0. Find item by Id" + ln
                        + "1. Exit" + ln
                        + "=== Find item by id ====" + ln
                        + item + ln
                        + "Menu:" + ln
                        + "0. Find item by Id" + ln
                        + "1. Exit" + ln
        ));*/
    }
}