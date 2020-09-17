import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.*;
public class RegisterOperator {

    @FXML
    TextField operatorName;
  @FXML
  TextField operatorLastName;
  @FXML
  TextField operatorPassword;

  private PreparedStatement createOperator;
    Connection con;

    public void addOperator(MouseEvent mouseEvent) {
        String oName = operatorName.getText();
        String oLastName = operatorLastName.getText();
        String oPassword = operatorPassword.getText();

        try {
            createOperator = con.prepareStatement("INSERT INTO public.\"Operator\"\n" +
                    "\"OperatorName\", \"LastName\", \"OperatorPassword\")\n" +
                    "\tVALUES (?, ?, ?);");
           

            createOperator.setString(1, oName);
            createOperator.setString(2, oLastName);
            createOperator.setString(3, oPassword);
            createOperator.executeUpdate();
        }catch (SQLException E) {

        }

    }
    public void goBackButtonClicked(MouseEvent mouseEvent) throws IOException {

        System.out.println("Going back to Main Menu");
        SceneSwitch.replaceScene(SceneSwitch.mainMenuFXML, SceneSwitch.mainMenuTitle, mouseEvent);

    }

}
