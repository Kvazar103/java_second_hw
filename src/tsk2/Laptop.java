package tsk2;

public class Laptop extends PC{
    private int Touchpad_size;
    private int Battery_life;

    public Laptop(Cpu CPU, Gpu GPU, Ram RAM, Monitor MONITOR, int Touchpad_size,int Battery_life) {
        super(CPU, GPU, RAM, MONITOR);
       this.Touchpad_size=Touchpad_size;
       this.Battery_life=Battery_life;
    }

    public int getTouchpad_size() {
        return Touchpad_size;
    }

    public void setTouchpad_size(int touchpad_size) {
        Touchpad_size = touchpad_size;
    }

    public int getBattery_life() {
        return Battery_life;
    }

    public void setBattery_life(int Battery_life) {
        this.Battery_life = Battery_life;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Touchpad_size=" + Touchpad_size +
                ", Battery_life=" + Battery_life + '\''+
                super.toString()+
                '}';
    }
}
