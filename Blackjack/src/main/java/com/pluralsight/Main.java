package com.pluralsight;


import com.sun.tools.jconsole.JConsolePlugin;

public class Main {
    public static void main(String[] args) {

        // prompt user for name
        String firstPlayerName = console.promptForString("Enter the name of the first player: ");
        String secondPlayerName = console.promptForString("Enter the name of the second player: ");


        // constructor
        Deck d = new Deck();
        d.shuffle();

        Player p1 = new Player(firstPlayerName);
        p1.setHand(new Hand());

        Player p2 = new Player(secondPlayerName);
        p2.setHand(new Hand());

        // constructor
        Hand h1 = new Hand(firstPlayerName);
        Hand h2 = new Hand(secondPlayerName);

        // create a single card
        Card c1 = d.deal();

        // have to flip the card
        c1.flip();

        // display to console
        display(c1);
        System.out.println(c1.getPointValue());

        // print out something to test
//       System.out.println(c1.getSuit());
//       System.out.println(c1.getValue());
//       System.out.println(c1.getPointValue());

        Card c2 = d.deal();
        c2.flip();

        // display
        display(c2);
        System.out.println(c2.getPointValue());

        h1.deal(c1);
        h1.deal(c2);

        display(c2);
        System.out.println(c2.getPointValue());


        System.out.println();
        System.out.println(h1.getValue());


    }

    public static void display(Card c){
        if(c.getSuit().equalsIgnoreCase("Hearts") || c.getSuit().equalsIgnoreCase("Diamonds") ){
            System.out.println(ColorCodes.RED + c.getValue() + " " + c.getSuit() + ColorCodes.RESET );
        }
        else{
            System.out.println(c.getValue() + " " + c.getSuit());
        }

    }
}


//package com.pluralsight;
//
//public class Main {
//
//    private static Console console = new Console();
//
//    public static void main(String[] args) {
//
//        String firstPlayerName = console.promptForString("Enter the name of the first player: ");
//        String secondPlayerName = console.promptForString("Enter the name of the second player: ");
//
//        Deck d = new Deck();
//        d.shuffle();
//
//        Player p1 = new Player(firstPlayerName);
//        p1.setHand(new Hand());
//
//        Player p2 = new Player(secondPlayerName);
//        p2.setHand(new Hand());
//
//
//        // Hand h1 = new Hand(firstPlayerName);
//        //  Hand h2 = new Hand(secondPlayerName);
//
//
//        for(int i = 0 ; i < 2 ; i++){
//            Card c;
//            c = d.deal();
//            c.flip();
//            p1.getHand().deal(c);
//
//            //h1.deal(d.deal());
//            c = d.deal();
//            c.flip();
//            p2.getHand().deal(c);
//        }
//
//        display(p1);
//        display(p2);
//
//    }
//
//    public static void display(Card c){
//        if(c.getSuit().equalsIgnoreCase("Hearts") || c.getSuit().equalsIgnoreCase("Diamonds") ){
//            System.out.println(ColorCodes.RED + c.getValue() + " " + c.getSuit() + ColorCodes.RESET );
//        }
//        else{
//            System.out.println(c.getValue() + " " + c.getSuit());
//        }
//
//    }
//
//    public static void display(Player player){
//        System.out.println(player.getPlayerName() +" has the follow cards:");
//        for(Card card: player.getHand().getCards()){
//            display(card);
//        }
//        System.out.println("Together they have the value of " + player.getHand().getValue());
//    }
//
//
//
//
//}