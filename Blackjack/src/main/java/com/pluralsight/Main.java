package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // constructor
        Deck d = new Deck();
        d.shuffle();

        // constructor
        Hand h1 = new Hand();

        // create a single card
        Card c1 = d.deal();

        // have to flip the card
        c1.flip();

        // print out something to test
       System.out.println(c1.getSuit());
       System.out.println(c1.getValue());
       System.out.println(c1.getPointValue());

        Card c2 = d,deal();
        c2.flip();

        h1.deal(c1);
        h1.deal(c2);
    }
}