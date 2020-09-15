
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;

import java.io.IOException;


public class CreateOrder {

    //Fill Observable lists with Customer and Operator-Array-lists from DB/API
    ObservableList<String> customerList = FXCollections.observableArrayList();
    ObservableList<String> operatorList = FXCollections.observableArrayList();






    //Some runnable method that updates the lists







   public void placeOrderButtonClicked(){

       //Send Order to DB/API --> notification to Operator

   }

    public void goBackButtonClicked(MouseEvent mouseEvent) throws IOException {

        System.out.println("Going back to Main Menu");
        SceneSwitch.replaceScene(SceneSwitch.mainMenuFXML, SceneSwitch.mainMenuTitle, mouseEvent);

    }


}
