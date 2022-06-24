package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DoubleLoop {
    public static void main(String[] args) {
        List<Card> deck = Stream.of(Suit.values())
                        .flatMap(suit -> Stream.of(Value.values())
                                        .map(cardValue -> new Card(suit, cardValue))
                                .forEachOrdered(deck::add));
    }
}
