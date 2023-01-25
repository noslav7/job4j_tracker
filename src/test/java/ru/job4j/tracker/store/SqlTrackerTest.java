package ru.job4j.tracker.store;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.job4j.tracker.model.Item;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
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
        Item item = new Item("item");
        tracker.add(item);
        assertThat(tracker.findById(item.getId())).isEqualTo(item);
    }

    @Test
    public void replaceTest() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        Item anotherItem = new Item("anotherItem");
        tracker.add(item);
        tracker.add(item);
        tracker.add(item);
        tracker.replace(2, anotherItem);
        assertThat(tracker.findById(anotherItem.getId())).isEqualTo(anotherItem);
    }

    @Test
    public void deleteTest() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        tracker.add(item);
        tracker.add(item);
        assertThat(tracker.delete(0));
    }

    @Test
    public void findAllTest() {
        SqlTracker tracker = new SqlTracker(connection);
        Item item = new Item("item");
        tracker.add(item);
        tracker.add(item);
        tracker.add(item);
        assertThat(tracker.findAll().size() == 3);
    }

    @Test
    public void findByNameTest() {
        SqlTracker tracker = new SqlTracker(connection);
        Item firstItem = new Item("firstItem");
        Item secondItem = new Item("secondItem");
        Item thirdItem = new Item("thirdItem");
        tracker.add(firstItem);
        tracker.add(secondItem);
        tracker.add(thirdItem);
        tracker.add(secondItem);
        List<Item> expectedItems = new ArrayList<>();
        expectedItems.add(secondItem);
        expectedItems.add(secondItem);
        assertThat(tracker.findByName("secondItem").equals(expectedItems));
    }

    @Test
    public void findByIdTest() {
        SqlTracker tracker = new SqlTracker(connection);
        Item firstItem = new Item("firstItem");
        Item secondItem = new Item("secondItem");
        Item thirdItem = new Item("thirdItem");
        tracker.add(firstItem);
        tracker.add(secondItem);
        tracker.add(thirdItem);
        assertThat(tracker.findById(2).equals(thirdItem));
    }

    @Test
    public void itemFromResultSetTest() {
        SqlTracker tracker = new SqlTracker(connection);
        Item actualItem = null;
        try (PreparedStatement statement = connection.prepareStatement(
                "select * from items where name = 'item'")) {
            try (ResultSet resultSet = statement.executeQuery()) {
                    actualItem = tracker.itemFromResultSet(resultSet);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertThat(actualItem.getName().equals("item"));
    }

}
