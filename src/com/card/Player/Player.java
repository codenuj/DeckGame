//Author : Ujjawal Sharma
package com.card.Player;

import com.card.Card.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private String name;

    public Player() {
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getHand() {
        return hand;
    }

    @Override
    public String toString() {

        return "Player{" +
                "hand=" + hand +
                '}';
    }

    //For sorting purpose
    public static int compareByValueThenSuite(Player p1, Player p2) {
        if (p1.getHand().get(0).getValue() == p2.getHand().get(0).getValue()) {
            return p2.getHand().get(0).getSuite().ordinal() - p1.getHand().get(0).getSuite().ordinal();
        } else {
            return p2.getHand().get(0).getValue() - p1.getHand().get(0).getValue();
        }
    }
}