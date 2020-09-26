import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {

    public static void main(String[] args) {

        launch(args);

    }


    @Override
    public void start(Stage primaryStage) throws IOException {

        FXMLLoader loader = SceneSwitch.getLoader(SceneSwitch.loginFXML);
        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setTitle(SceneSwitch.loginTitle);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.toFront();



    }

}
