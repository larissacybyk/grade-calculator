package gradecalc;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.List;

public class CalcController {
    @FXML Label LetterGradeDisplay;
    @FXML Label PercentageGrade;
    @FXML GridPane ComponentGrid;
    private String lime = "#76B947";
    private String seafoam = "#2F5233";
    private String kelly = "#B1D8B7";
    private String spearmint = "#94C973";
    private Calculation calc;

    @FXML
    protected void onCalculateButtonClick() {
       updateShownGrade();
    }
    public void initialize(){
        calc = new Calculation();
    }

    public void updateShownGrade(){
        List<Component> components = getComponentList();
        double numGrade = calc.getGrade(components);
        letterGrade letGrade = getLetterGrade(numGrade);
        String percentageGrade = numGrade + "%";
        LetterGradeDisplay.setText(letGrade.toString());
        PercentageGrade.setText(percentageGrade);
    }
    public List<Component> getComponentList(){
        List<Component> components = new ArrayList<Component>();
        Node[][] componentArr = new Node[9][2];
        for(Node node : ComponentGrid.getChildren()) {
            int row = 0;
            int col = 0;
            try{
                row = ComponentGrid.getRowIndex(node);
            } catch(Exception e){}
            try{
                col = ComponentGrid.getColumnIndex(node);
            } catch(Exception e){}
            componentArr[row][col] = node;
        }
        for(int i=1;i<9;i++){
            if(((TextField) componentArr[i][0]).getText() != "" && ((TextField) componentArr[i][1]).getText() != "") {
                double percent = Double.parseDouble(((TextField) componentArr[i][0]).getText());
                double weight = Double.parseDouble(((TextField) componentArr[i][1]).getText());
                components.add(new Component(weight, percent));
            }
        }
        return components;
    }
    public letterGrade getLetterGrade(double grade){
        if(grade < 65.0){
            return letterGrade.F;
        } else if (grade < 70) {
            return letterGrade.Dminus;
        } else if(grade < 73) {
            return letterGrade.Cminus;
        } else if (grade < 77) {
            return letterGrade.C;
        } else if(grade < 80) {
            return letterGrade.Cplus;
        } else if (grade < 83) {
            return letterGrade.Bminus;
        } else if(grade < 87) {
            return letterGrade.B;
        } else if (grade < 90) {
            return letterGrade.Bplus;
        } else if(grade < 93) {
            return letterGrade.Aminus;
        } else if(grade < 98) {
            return letterGrade.A;
        } else return letterGrade.Aplus;
    }

}