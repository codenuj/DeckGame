//Author : Ujjawal Sharma
package com.card;

import com.card.Deck.Deck;
import com.card.Player.Player;
import com.card.Util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        Util util = new Util();
        System.out.println(deck);
        System.out.println("Size of deck is: " + deck.getSizeOfDeck());
        deck.shuffle();
        System.out.println("Deck after shuffling is " + deck);
        System.out.println("Enter number of player playing game:");
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForName = new Scanner(System.in);
        int numberOfPlayer;
        List<Player> playerList = new ArrayList<>();
        numberOfPlayer = scanner.nextInt();
        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.println("Enter name of player playing game:");
            String nameOfPlayer = scannerForName.next();
            Player player = new Player();
            player.setName(nameOfPlayer);
            playerList.add(player);
            deck.dealCard(player);
            System.out.println("Size of deck after dealing a card to player is " + deck.getSizeOfDeck());
        }
        playerList.sort(Player::compareByValueThenSuite);
        System.out.println("Winners are as following:\n");
        int rank = 1;
        for (Player player : playerList) {
            System.out.println(rank + ".Hand of " + player.getName() + " is " + util.valueOfCard(player.getHand().get(0)));
            rank++;
        }

        for (Player player : playerList) {
            player.getHand().add(deck.dealCard());
        }
    }
}
