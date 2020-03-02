//Author : Ujjawal Sharma
package com.card.Util;

import com.card.Card.Card;

public class Util {
    public String valueOfCard(Card card) {
        String value = "";
        if (card.getValue() == 1)
            value += "A";
        else if (card.getValue() <= 10) {
            value += card.getValue();
        } else {
            switch (card.getValue()) {
                case 11:
                    value += "J";
                    break;
                case 12:
                    value += "Q";
                    break;
                case 13:
                    value += "K";
                    break;
            }
        }
        switch (card.getSuite()) {
            case CLUB:
                value += "\u2663";
                break;
            case HEART:
                value += "\u2665";
                break;
            case DIAMOND:
                value += "\u2666";
                break;
            case SPADE:
                value += "\u2660";
                break;
        }
        return value;
    }
}
