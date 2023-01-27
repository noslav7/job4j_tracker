package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {
    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder sb = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                sb.append(evenElements.pollFirst());
            } else {
                evenElements.removeFirst();
            }
        }
        return sb.toString();
    }

    private String getDescendingElements() {
        StringBuilder sb = new StringBuilder();
        for (int i = descendingElements.size() - 1; i > -1; i--) {
                sb.append(descendingElements.removeLast());
        }
        return sb.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
