package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class  StartUITest {

    @Test
    public void whenEditItem() {
        Output output = new ConsoleOutput();
        Store store = new SqlTracker();
        Item item = store.add(new Item("Replaced item"));
        String replacedName = "Edited item";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, store, Arrays.asList(actions));
        assertThat(store.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new ConsoleOutput();
        Store store = new SqlTracker();
        Item item = store.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, store, Arrays.asList(actions));
        Assert.assertNull(store.findById(item.getId()));
    }

    @Test
    public void whenCreateItem() {
        Output output = new ConsoleOutput();
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Store store = new SqlTracker();
        UserAction[] actions = {
                new CreateAction(output),
                new Exit(output)
        };
        new StartUI(output).init(in, store, Arrays.asList(actions));
        assertThat(store.findAll().get(0).getName(), is("Item name"));
    }

    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"-1", "0"}
        );
        Store store = new SqlTracker();
        UserAction[] actions = new UserAction[]{
            new Exit(out)
        };
        new StartUI(out).init(in, store, Arrays.asList(actions));
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                              + "0. Exit" + ln
                               + "Wrong input, you can select: 0 .. 0" + ln
                               + "Menu:" + ln
                                + "0. Exit" + ln
                      )
        );
    }
}