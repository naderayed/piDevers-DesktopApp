package Controllers;

import Tools.MaConnexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/Views/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        MaConnexion mc = MaConnexion.getInstance();
        stage.setTitle("Hello Pidevers !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}