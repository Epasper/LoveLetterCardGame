package LoveLetter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class JavaFxUi {

    private GridPane root = new GridPane();
    Scene gameScene = new Scene(root, 1500, 800, Color.AZURE);
    private ArrayList<Button> listOfButtons = new ArrayList<>();
//    Button card1 = new Button();

    public void launchTheGameUi() throws Exception {
        Stage primaryStage = new Stage();
        for (int i = 0; i < 2; i++) {
            listOfButtons.add(new Button());
            listOfButtons.get(i).setMaxSize(225, 350);
            listOfButtons.get(i).setMinSize(225,350);
            root.add(listOfButtons.get(i), i, 2);
        }
        primaryStage.setTitle("Love Letter by Szymon Ilnicki.");
        primaryStage.setScene(gameScene);
        primaryStage.show();
    }
}
