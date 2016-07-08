package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import newGuI.GeneratedFields;
import newGuI.GeneratedGUI;

public class Controller {
    public static int numTotal = 0;
    private static int[] numArray;

    @FXML private Button calcAmount;
    @FXML private TextField amount;
    @FXML
        public void calcAmountA(ActionEvent actionEvent) {
            numTotal = Integer.parseInt(amount.getText());
        GeneratedFields generatedFields = new GeneratedFields(numTotal);

    }


    }

