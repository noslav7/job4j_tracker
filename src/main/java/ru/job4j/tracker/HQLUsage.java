package ru.job4j.tracker;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HQLUsage {
    public static void main(String[] args) {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();
        try (SessionFactory sf = new MetadataSources(registry)
                .buildMetadata().buildSessionFactory()) {
            Session session = sf.openSession();
            /* working with session */
            Item item = new Item("name");
            try {
                session.beginTransaction();
                session.save(item);
                session.getTransaction().commit();
            } catch (Exception e) {
                session.getTransaction().rollback();
            }
            session.close();
        } finally {
            StandardServiceRegistryBuilder.destroy(registry);
        }
    }
}
