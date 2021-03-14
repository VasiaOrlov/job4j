package ru.job4j.tream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{"
                + "suit=" + suit
                + ", value=" + value
                + '}';
    }

    public static void main(String[] args) {
        List<Card> list = Stream.of(Suit.values()).
                flatMap(e -> Stream.of(Value.values())
                        .map(x -> new Card(e, x)))
                        .collect(Collectors.toList());
        System.out.println(list);
    }

}