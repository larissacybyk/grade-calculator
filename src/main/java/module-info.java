module com.example.gradecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens gradecalc to javafx.fxml;
    exports gradecalc;
}