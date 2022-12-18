package gradecalc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalcController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("How are your grades?");
        welcomeText.setStyle("-fx-border-color: green; -fx-background-color: #eeeaea; -fx-text-fill: green; -fx-border-width: 3");
    }
}