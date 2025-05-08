package com.pluralsight;

import java.util.ArrayList;

public class Hand {

    // create an array list for the hand of cards
    private ArrayList<Card> cards;

    // this would allow to be dealt a card
    public Hand(String_playerName){

        cards = new ArrayList<Card>();
        this
    }

    // adds cards to deal
    public void deal(Card card){

        this.cards.add(card);
    }

    // shows the "size" of the cards
    public int getSize(){
        return this.cards.size();
    }

    public int getValue(){
        int total = 0;
        for(Card c:this.cards){
            total += c.getPointValue();
        }
        return total;
    }
}
