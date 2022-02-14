package Controllers;

import Entities.Hotel;
import Services.HotelService;
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

        /* Start Crud Hotel */
        MaConnexion mc = MaConnexion.getInstance();
        Hotel h = new Hotel(1,"moradi","guittar","fdsf",5,"2154",
                21.2f,"ddsd");
        HotelService hs = new HotelService();
        // hs.ajouter(h);
        System.out.println(hs.afficher());
        // hs.modifier(h);
        System.out.println(hs.afficher());
        hs.supprimer(h);
        System.out.println(hs.afficher());
        /* End Crud Hotel */

        stage.setTitle("Hello Pidevers !");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}