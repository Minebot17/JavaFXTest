package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Address App");

        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("view/RootLayout.fxml"));
            rootLayout = loader.load();
            primaryStage.setScene(new Scene(rootLayout));
            primaryStage.show();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        showPersonOverview();
    }

    public void showPersonOverview(){
        try {
            rootLayout.setCenter(new FXMLLoader(Main.class.getResource("view/PersonOverview.fxml")).load());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
