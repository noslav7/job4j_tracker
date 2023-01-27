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
        return "";
    }

    private String getDescendingElements() {
        return "";
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
