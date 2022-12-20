package gradecalc;

public class Component {
    private double weight;
    private double grade;

    public Component(double weight, double grade){
        this.grade = grade;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
