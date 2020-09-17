
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class MainMenu {


    public void placeOrderClicked (MouseEvent mouseEvent) throws IOException {

        System.out.println("Going to Create Order");
        SceneSwitch.replaceScene(SceneSwitch.createOrderFXML, SceneSwitch.createOrderTitle, mouseEvent);

    }

    public void registerEmployeeClicked (MouseEvent mouseEvent) throws IOException{

        System.out.println("Going to Create Operator");
        SceneSwitch.replaceScene(SceneSwitch.registerOperatorFXML, SceneSwitch.registerOperatorTitle, mouseEvent);
    }

    public void registerCustomerClicked (MouseEvent mouseEvent){

    }

    public void logOutButtonClicked (MouseEvent mouseEvent) throws IOException {

        System.out.println("Logging out");
        SceneSwitch.replaceScene(SceneSwitch.loginFXML, SceneSwitch.loginTitle, mouseEvent);

    }

}
