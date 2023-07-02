package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class HbmTracker implements Store, AutoCloseable {
    private final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure().build();
    private final SessionFactory sf = new MetadataSources(registry)
            .buildMetadata().buildSessionFactory();

    @Override
    public Item add(Item item) {
        Session session = sf.openSession();
        try {
            session.beginTransaction();
            session.save(item);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        session.close();
        return item;
    }

    @Override
    public boolean replace(Integer id, Item item) {
        Session session = sf.openSession();
        try {
            session.beginTransaction();
            session.createQuery(
                            "UPDATE Item SET name = :fName WHERE id = :fId", Item.class)
                    .setParameter("fName", item.getName())
                    .setParameter("fId", id);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public boolean delete(Integer id) {
        Session session = sf.openSession();
        try {
            session.beginTransaction();
            session.createQuery(
                            "DELETE Item i WHERE i.id = :fId", Item.class)
                    .setParameter("fId", id);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public List<Item> findAll() {
        Session session = sf.openSession();
        List<Item> result = Collections.emptyList();
        try {
            session.beginTransaction();
            result = session.createQuery(
                            "from Item", Item.class)
                    .list();
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        return result;
    }

    @Override
    public List<Item> findByName(String key) {
        Session session = sf.openSession();
        List<Item> result = Collections.emptyList();
        try {
            session.beginTransaction();
            result = session.createQuery(
                            "from Item i where i.name = :name", Item.class)
                    .setParameter("name", key)
                    .list();
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        return result;
    }

    @Override
    public Item findById(Integer id) {
        Session session = sf.openSession();
        Item result = null;
        try {
            session.beginTransaction();
            result = session.createQuery(
                            "from Item i where i.id = :id", Item.class)
                    .setParameter("id", id)
                    .uniqueResult();
            session.getTransaction().commit();
            session.close();
        } catch (Exception e) {
            session.getTransaction().rollback();
        }
        if (result == null) {
            throw new IllegalArgumentException("Item with id = " + id + " does not exist");
        }
        return result;
    }

    @Override
    public void close() {
        StandardServiceRegistryBuilder.destroy(registry);
    }
}
