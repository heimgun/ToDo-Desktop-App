
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.sql.*;
import java.util.*;


public class CreateOrder {


    Connection con;
    PreparedStatement getCustomers, getOperator;

    //Fill Observable lists with Customer and Operator-Array-lists from DB/API
    ObservableList<String> customerList = FXCollections.observableArrayList();
    ObservableList<String> operatorList = FXCollections.observableArrayList();




    //Should run before opening scene (maybe upon clicking “Create Order”-button)
    public void myVoid() throws SQLException {


        while(getCustomers().next() && getOperators().next()){


            Customer customer = new Customer();
            customer.setName(getCustomers().getString("Name"));
            customer.setCustomerID(getCustomers().getInt("CustomerID"));
            Customer.customers.add(customer);


            Operator operator = new Operator();
            operator.setOperatorID(getOperators().getInt("OperatorID"));
            operator.setOperatorLastName(getOperators().getString("LastName"));
            Operator.operators.add(operator);



        }



    }

    public ResultSet getCustomers() throws SQLException {

        con = ConDB.getConnection();
        con.setAutoCommit(false);

        getCustomers = con.prepareStatement("SELECT * FROM public.\"Customer\"");
        System.out.println("Customers received");
        return getCustomers.executeQuery();

    }

    public ResultSet getOperators() throws SQLException {

        con = ConDB.getConnection();
        con.setAutoCommit(false);

        //Merge-statement with available-table
        getOperator = con.prepareStatement("SELECT * From public.\"Operator\"");
        System.out.println("Available Operators received");
        return getOperator.executeQuery();


    }







   public void placeOrderButtonClicked(){

       //Send Order to DB/API --> notification to Operator

   }

    public void goBackButtonClicked(MouseEvent mouseEvent) throws IOException {

        System.out.println("Going back to Main Menu");
        SceneSwitch.replaceScene(SceneSwitch.mainMenuFXML, SceneSwitch.mainMenuTitle, mouseEvent);

    }


}
