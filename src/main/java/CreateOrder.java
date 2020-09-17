
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.*;


public class CreateOrder {


    Connection con;
    PreparedStatement submitOrder;



    @FXML
    ComboBox<Customer> customerList;

    @FXML
    ComboBox<Operator> operatorList;

    ObservableList<Customer> customers = FXCollections.observableArrayList(Customer.customers);
    ObservableList<Operator> operator = FXCollections.observableArrayList(Operator.operators);


    @FXML
    public void initialize() throws SQLException {

        try {

            customerList.setItems(customers);
            operatorList.setItems(operator);

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }






    public void placeOrderButtonClicked(){

       //Send Order to DB/API --> notification to Operator

   }

    public void goBackButtonClicked(MouseEvent mouseEvent) throws IOException {

        System.out.println("Going back to Main Menu");
        SceneSwitch.replaceScene(SceneSwitch.mainMenuFXML, SceneSwitch.mainMenuTitle, mouseEvent);

    }


}
