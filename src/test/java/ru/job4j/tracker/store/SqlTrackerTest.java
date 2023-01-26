package ru.job4j.tracker.store;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.job4j.tracker.model.Item;

import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;

public class SqlTrackerTest {
    private static Connection connection;

    @BeforeAll
    public static void initConnection() {
        try (InputStream in = SqlTrackerTest.class.getClassLoader()
                .getResourceAsStream("test.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            connection = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")

            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @AfterAll
    public static void closeConnection() throws SQLException {
        connection.close();
    }

    @AfterEach
    public void wipeTable() throws SQLException {
        try (PreparedStatement statement = connection.prepareStatement("delete from items")) {
            statement.execute();
        }
    }

    @Test
    public void whenSaveItemAndFindByGeneratedIdThenMustBeTheSame() {
        SqlTracker tracker = new SqlTracker(connection);

        Item item =  tracker.add(new Item("item"));

        assertThat(tracker.findById(item.getId())).isEqualTo(item);
    }

    @Test
    public void whenReplaceThenAnotherName() {
        SqlTracker tracker = new SqlTracker(connection);

        Item item = tracker.add(new Item("item"));
        tracker.add(item);
        tracker.add(item);
        Item anotherItem = new Item("anotherItem");
        tracker.replace(2, anotherItem);

        assertThat(tracker.findById(anotherItem.getId()).getName()).isEqualTo(anotherItem.getName());
    }

    @Test
    public void whenDeleteThenTrue() {
        SqlTracker tracker = new SqlTracker(connection);

        Item item1 = tracker.add(new Item("item"));
        Item item2 = tracker.add(new Item("item"));
        Item item3 = tracker.add(new Item("item"));
        tracker.delete(2);

        assertThat(tracker.findById(item3.getId()) == null);
    }

    @Test
    public void whenFindAllThenThree() {
        SqlTracker tracker = new SqlTracker(connection);

        tracker.add(new Item("item"));
        tracker.add(new Item("item"));
        tracker.add(new Item("item"));

        assertThat(tracker.findAll().size() == 3);
    }

    @Test
    public void whenFindByNameThenSecondItems() {
        SqlTracker tracker = new SqlTracker(connection);

        Item firstItem = tracker.add(new Item("firstItem"));
        Item secondItem = tracker.add(new Item("secondItem"));
        Item thirdItem = tracker.add(new Item("thirdItem"));
        tracker.add(secondItem);

        assertThat(tracker.findByName("secondItem").equals(List.of(secondItem, secondItem)));
    }

    @Test
    public void whenFindByIdThenThirdItem() {
        SqlTracker tracker = new SqlTracker(connection);

        Item firstItem = tracker.add(new Item("firstItem"));
        Item secondItem = tracker.add(new Item("secondItem"));
        Item thirdItem = tracker.add(new Item("thirdItem"));

        assertThat(tracker.findById(2).equals(thirdItem));
    }
}
