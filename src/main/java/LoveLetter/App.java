package LoveLetter;


import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

import static javafx.application.Application.launch;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        JavaFxUi javaFxUi = new JavaFxUi();
        javaFxUi.launchTheGameUi();
    }
    public static void main(String[] args) {
        launch(args);
        Game game = new Game();
        game.setUpTheGame();
    }


}
