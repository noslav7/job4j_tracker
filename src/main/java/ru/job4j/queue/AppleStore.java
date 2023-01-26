package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        for (int i = 0; i < queue.size(); i++) {
            if (i < count - 1) {
                queue.remove();
            }
        }
        return queue.peek().name();
    }

    public String getLastUpsetCustomer() {
        for (int i = 0; i < queue.size(); i++) {
            if (i < count) {
                queue.remove();
            }
        }
        return queue.peek().name();
    }
}
