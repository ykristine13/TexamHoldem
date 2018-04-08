package sample;

import java.util.ArrayList;
import java.util.Random;
/**
 * Created by Yvonne on 12/03/2018.

 **/

public class Deck {

    // constants
    public static final double IMAGE_WIDTH = 130.0, IMAGE_HEIGHT = 200.0;
    public static final int RANK_TOTAL = 13;
    public static final int SUIT_TOTAL = 4;
    private static final String basePath = "File:../../images/";

    // fields
    private Card[] PokerCards = new Card[52];



    //constructor
    public Deck() {

        int i; // poker card index
        int s; // suit index
        for(Card.Suits suit: Card.Suits.values()){
            s = 0;
            for(i = 0; i < RANK_TOTAL; i++){
                String imagePath = basePath + new String(i+1 + "-of-" + suit);
                System.out.println(imagePath);
                PokerCards[RANK_TOTAL*s + i] = new Card(i + 1, suit, imagePath, IMAGE_WIDTH, IMAGE_HEIGHT);
            }
            s++;
        }
        //Card aceOfHearts = new Card(1, Card.Suits.hearts, "ace-of-hearts.png",200.0,130.0);
    }

    public Card[] getCards(){
        return this.PokerCards;
    }


}
