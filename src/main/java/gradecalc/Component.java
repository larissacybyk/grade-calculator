package gradecalc;

public class Component {
    private int weight;
    private int grade;

    public Component(int weight, int grade){
        this.grade = grade;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
