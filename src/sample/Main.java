package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Texas Holdem Poker");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(13); // horizontal gap between screen elements
        grid.setVgap(15); // vertical gap ...
        grid.setPadding(new Insets(25,25,25,25));
        grid.setId("pane");

        Deck Poker = new Deck();

        Card[] pokerCards = Poker.getCards();

        grid.add(pokerCards[0].getImageView(), 1, 0);

        Button startBtn = new Button("Start Game");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().add(startBtn);

        grid.add(hBox, 15, 35);
        for(Card.Suits s: Card.Suits.values()){
            System.out.println(s);
        }

        Scene table = new Scene(grid, 1000, 675);
        table.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        primaryStage.setScene(table);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
