package tsk2;

public class Gpu {
    private String model;
    private GPU_Brand brand;
    private int clock;
    private int graphics_ram_size;

    public Gpu(String model, GPU_Brand brand, int clock, int graphics_ram_size) {
        this.model = model;
        this.brand = brand;
        this.clock = clock;
        this.graphics_ram_size = graphics_ram_size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public GPU_Brand getBrand() {
        return brand;
    }

    public void setBrand(GPU_Brand brand) {
        this.brand = brand;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public int getGraphics_ram_size() {
        return graphics_ram_size;
    }

    public void setGraphics_ram_size(int graphics_ram_size) {
        this.graphics_ram_size = graphics_ram_size;
    }

    @Override
    public String toString() {
        return "Gpu{" +
                "model='" + model + '\'' +
                ", brand=" + brand +
                ", clock=" + clock +
                ", graphics_ram_size='" + graphics_ram_size + '\'' +
                '}';
    }
}
