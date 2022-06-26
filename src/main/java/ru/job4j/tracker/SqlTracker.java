package ru.job4j.tracker;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlTracker implements Store, AutoCloseable {
    private Connection cn;
    private List<Item> items = new ArrayList<>();
    private int id = 1;

    public void init() {
        try (InputStream in = SqlTracker.class.getClassLoader()
                .getResourceAsStream("app.properties")) {
            Properties config = new Properties();
            config.load(in);
            Class.forName(config.getProperty("driver-class-name"));
            cn = DriverManager.getConnection(
                    config.getProperty("url"),
                    config.getProperty("username"),
                    config.getProperty("password")
            );
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void close() throws Exception {
        if (cn != null) {
            cn.close();
        }
    }

    @Override
    public Item add(Item item) {
        items.add(item);
        item.setId(id++);
        return item;
    }

    @Override
    public boolean replace(int id, Item item) {
        boolean replace = false;
        if (id > -1 && id <  items.size()) {
            items.set(id, item);
            replace = true;
        }
        return replace;
    }

    @Override
    public boolean delete(int id) {
        boolean deleted = false;
        if (id > -1 && id <  items.size()) {
            items.remove(id);
            deleted = true;
        }
        return deleted;
    }

    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public List<Item> findByName(String key) {
        List<Item> findings = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                findings.add(item);
            }
        }
        return findings;
    }

    @Override
    public Item findById(int id) {
        Item foundItem = null;
        for (Item item : items) {
            if (item.getId() == id) {
               foundItem = item;
            }
        }
        return foundItem;
    }
}
