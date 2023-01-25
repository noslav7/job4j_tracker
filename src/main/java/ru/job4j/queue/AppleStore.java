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
        int remains = count;
        while (remains > 1) {
            remains--;
            queue.remove();
        }
        return queue.peek().name();
    }

    public String getLastUpsetCustomer() {
        int remains = count;
        while (remains > 0) {
            remains--;
            queue.remove();
        }
        return queue.peek().name();
    }
}
