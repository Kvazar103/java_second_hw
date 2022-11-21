package tsk2;

public class Cpu {
    private CPU_Brand brand;
    private String CPU_model;
    private double CPU_speed;

    public Cpu(CPU_Brand brand, String CPU_model, double CPU_speed) {
        this.brand = brand;
        this.CPU_model = CPU_model;
        this.CPU_speed = CPU_speed;
    }

    public CPU_Brand getBrand() {
        return brand;
    }

    public void setBrand(CPU_Brand brand) {
        this.brand = brand;
    }

    public String getCPU_model() {
        return CPU_model;
    }

    public void setCPU_model(String CPU_model) {
        this.CPU_model = CPU_model;
    }

    public double getCPU_speed() {
        return CPU_speed;
    }

    public void setCPU_speed(int CPU_speed) {
        this.CPU_speed = CPU_speed;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "brand=" + brand +
                ", CPU_model='" + CPU_model + '\'' +
                ", CPU_speed=" + CPU_speed +
                '}';
    }
}
