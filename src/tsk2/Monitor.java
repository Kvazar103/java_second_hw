package tsk2;

public class Monitor {
    private int inch;
    private int resolution;
    private int refresh_rate;
    private Monitor_Brand brand;

    public Monitor(int inch, int resolution, int refresh_rate, Monitor_Brand brand) {
        this.inch = inch;
        this.resolution = resolution;
        this.refresh_rate = refresh_rate;
        this.brand = brand;
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getRefresh_rate() {
        return refresh_rate;
    }

    public void setRefresh_rate(int refresh_rate) {
        this.refresh_rate = refresh_rate;
    }

    public Monitor_Brand getBrand() {
        return brand;
    }

    public void setBrand(Monitor_Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "inch=" + inch +
                ", resolution=" + resolution +
                ", refresh_rate=" + refresh_rate +
                ", brand=" + brand +
                '}';
    }
}
