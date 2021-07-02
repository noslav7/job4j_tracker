package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindIdActionTest {

    @Test
    public void execute() {
        Tracker tracker = new Tracker();
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", String.valueOf(tracker.getId()), "1"}
        );
        UserAction[] actions = {
                new FindIdAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById()[0].getId(), is("Item name"));
    }
}