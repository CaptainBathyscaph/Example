package HomeTask1;

import lesson.AbstractProduct;


public class Fruit extends AbstractProduct {
    private double weight;
    private String grade;

    public Fruit(String name, double price, double weight, String grade) {
        super(name, price);
        this.weight = weight;
        this.grade = grade;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", grade='" + grade + '\'' +
                '}';
    }
}
