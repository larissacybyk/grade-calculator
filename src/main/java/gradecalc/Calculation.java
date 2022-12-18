package gradecalc;

import java.util.List;

public class Calculation {
    public Calculation(){
    }
    public double getGrade(List<Component> components){
        double totalPercent = 0;
        int totalWeight = 0;
        for(Component comp : components){
            totalWeight += comp.getWeight();
        }
        for(Component comp : components){
            totalPercent += (comp.getGrade() * comp.getWeight())/totalWeight;
        }
        return totalPercent;
    }
}
