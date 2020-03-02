//Author : Ujjawal Sharma
package com.card.Card;

public class Card {
    private int value;
    private SUITE suite;

    public Card(int value, SUITE suite) {
        this.value = value;
        this.suite = suite;
    }

    public int getValue() {
        return value;
    }

    public SUITE getSuite() {
        return suite;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSuite(SUITE suite) {
        this.suite = suite;
    }

    @Override
    public String toString() {
        return "Card{" + "value=" + value + ", suite=" + suite + '}';
    }

    //Suite Class for Heart, Spade, Club, Diamond
    public enum SUITE {
        DIAMOND,
        CLUB,
        HEART,
        SPADE
    }
}