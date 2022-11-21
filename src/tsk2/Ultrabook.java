package tsk2;

public class Ultrabook extends Laptop{

    private double weight;
    public Ultrabook(Cpu CPU, Gpu GPU, Ram RAM, Monitor MONITOR, int Touchpad_size, int Battery_life,double weight) {
        super(CPU, GPU, RAM, MONITOR, Touchpad_size, Battery_life);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "weight=" + weight +
                + '\''+
                super.toString()+
                '}';
    }
}
