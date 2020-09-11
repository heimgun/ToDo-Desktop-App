import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.sql.*;

public class Login {

    private String username, pw;
    Connection con;








    public void loginButtonClicked (MouseEvent mouseEvent) throws IOException {

        System.out.println("Logging into Main Menu");
        SceneSwitch.replaceScene(SceneSwitch.mainMenuFXML, SceneSwitch.mainMenuTitle, mouseEvent);
    }

    public void closeButtonClicked (MouseEvent mouseEvent) throws IOException {

        System.out.println("Exiting Program");
        System.exit(0);
    }




}
