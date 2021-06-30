package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

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

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "replaced item"
        };
        StartUI.replaceItem(new StubInput(answers), tracker);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item(null);
        tracker.replace(0, item);
        String[] answers = {
                String.valueOf(item.getId()),
                "deleted item"
        };
        Item deleted = tracker.findById(item.getId());
        assertNull(deleted);
    }
}