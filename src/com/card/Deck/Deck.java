//Author : Ujjawal Sharma
package com.card.Deck;

import com.card.Card.Card;
import com.card.Player.Player;
import com.card.Util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardDeck;
    private Util util = new Util();

    public Deck() {
        this.cardDeck = new ArrayList<>();
        for (int value = 1; value <= 13; value++) {
            for (Card.SUITE suite : Card.SUITE.values()) {
                cardDeck.add(new Card(value, suite));
            }
        }
    }

    //For printing Deck in a presentable format
    @Override
    public String toString() {
        String allCards = "";
        for (Card card : cardDeck) {
            allCards += util.valueOfCard(card) + ",";
        }
        return "Deck:-\n" + allCards;
    }

    //For shuffling card deck we can use shuffle of @Collections
    public void shuffle() {
        Collections.shuffle(cardDeck);
    }

    public void dealCard(Player player) {
        //Get next card and add to hand of the player
        Card removedCard = cardDeck.remove(0);
        player.getHand().add(removedCard);
    }

    public Card dealCard() {
        return cardDeck.remove(0);
    }

    //Size of the deck
    public int getSizeOfDeck() {
        return cardDeck.size();
    }
}