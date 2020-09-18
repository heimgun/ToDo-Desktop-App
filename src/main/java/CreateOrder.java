
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.sql.*;


public class CreateOrder {


    Connection con;
    PreparedStatement submitOrder;

    @FXML
    TextArea description;


    @FXML
    ComboBox<Customer> customerList;

    @FXML
    ComboBox<Operator> operatorList;

    ObservableList<Customer> customers = FXCollections.observableArrayList(Customer.customers);
    ObservableList<Operator> operator = FXCollections.observableArrayList(Operator.operators);

    Alert a = new Alert(Alert.AlertType.NONE);


    @FXML
    public void initialize(){

        try {

            customerList.setItems(customers);
            operatorList.setItems(operator);

        }
        catch (Exception e){
            e.printStackTrace();
        }



    }




    public void placeOrderButtonClicked(){

        Customer customer = customerList.getSelectionModel().getSelectedItem();
        Operator operator = operatorList.getSelectionModel().getSelectedItem();

        int operatorID = operator.getOperatorID();
        int customerID = customer.getCustomerID();

        String orderDescription = description.getText();


        try{

            submitOrderToDB(orderDescription, operatorID, customerID);
            a.setAlertType(Alert.AlertType.CONFIRMATION);
            a.setTitle("Order Submitted");
            a.setContentText("Task " + orderDescription + " at " + customer.getName() + "s place\n" + "is sent to: "+ operator.getOperatorLastName());
            a.show();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


   public void submitOrderToDB(String description, int operatorID, int customerID) throws SQLException {

        con = ConDB.getConnection();
        con.setAutoCommit(false);

        submitOrder = con.prepareStatement("INSERT INTO \"Task\"" +
                "(\"Description\", \"OperatorID\", \"CustomerID\", \"Status\", \"Accepted\")" +
                "VALUES(?, ?, ?, ?, ?)");
        submitOrder.setString(1, description);
        submitOrder.setInt(2, operatorID);
        submitOrder.setInt(3, customerID);
        submitOrder.setString(4, "PENDING");
        submitOrder.setString(5, "N");
        submitOrder.executeUpdate();
        con.commit();
        submitOrder.close();

       System.out.println("Order Submitted to Task in DB");


   }

    public void goBackButtonClicked(MouseEvent mouseEvent) throws IOException {

        System.out.println("Going back to Main Menu");
        SceneSwitch.replaceScene(SceneSwitch.mainMenuFXML, SceneSwitch.mainMenuTitle, mouseEvent);

    }


}
