package sample;

/**
 * Created by Yvonne on 10/03/2018.
 */

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Card {
    public enum Suits{
        hearts, clubs, diamonds, spades
    }

    private int Rank;
    private  String Suit;
    private ImageView ImgView;


    public Card(int inRank, Suits inSuit){
        setRank(inRank);
        setSuit(inSuit);
        setImage("", 0,0);
    }

    public Card(int inRank, Suits inSuit, String imgPath, double width, double height){
        setRank(inRank);
        setSuit(inSuit);
        setImage(imgPath, width, height);
    }

    public int getRank(){
        return this.Rank;
    }

    public String getSuit(){
        return this.Suit;
    }

    public ImageView getImageView(){
        return this.ImgView;
    }

    public String setRank(int inRank){
        String message = new String("");
        if(inRank < 1 || inRank > 10){
            message = new String("Invalid card rank provided");
            return message;
        }
        else
            Rank = inRank;
        return message;
    }

    public String setSuit(Suits inSuit){
        String message = new String("All good!");
        switch(inSuit){
            case hearts:
                Suit = new String("Hearts");
                break;
            case spades:
                Suit = new String("Spades");
                break;
            case diamonds:
                Suit = new String("Diamonds");
                break;
            case clubs:
                Suit = new String("Clubs");
                break;
            default:
                message = new String("Invalid Suit. Hearts, clubs, Spades and Diamonds only.");
                break;
        }
        return  message;
    }

    public void setImage(String imagePath, double width, double height) {
        Image img = new Image("File:" + imagePath);
        ImgView = new ImageView(img);
        if (width > 0 && height > 0) {
            ImgView.setFitHeight(width);
            ImgView.setFitWidth(height);
        }
    }

}
