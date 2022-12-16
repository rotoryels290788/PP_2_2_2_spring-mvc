package web.model;

public class Car {
    public Car() {
    }

    private String model;

    private String color;

    private double ObDvs;


    public Car(String model, String color, double ObDvs) {
        this.model = model;
        this.color = color;
        this.ObDvs = ObDvs;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getObDvs() {
        return ObDvs;
    }

    public void setNumber(double ObDvs) {
        this.ObDvs = ObDvs;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", ObDvs=" + ObDvs +
                '}';
    }

}