package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public static int numTotal;
    @FXML private Button calcAmount;
    @FXML private TextField amount;
    @FXML
        public void calcAmountA(ActionEvent actionEvent) {
        numTotal = Integer.parseInt(amount.getText());
    }
}
