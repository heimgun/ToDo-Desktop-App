import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreateOrder {

    //Fill Observable lists later
    ObservableList<String> customerList = FXCollections.observableArrayList();
    ObservableList<String> operatorList = FXCollections.observableArrayList();









   public void placeOrderButtonClicked(){

       //Send Order to DB/API --> notification to Operator

   }

    public void goBackButtonClicked(MouseEvent mouseEvent) throws IOException {

        System.out.println("Going back to Main Menu");
        SceneSwitch.replaceScene(SceneSwitch.mainMenuFXML, SceneSwitch.mainMenuTitle, mouseEvent);

    }


}
