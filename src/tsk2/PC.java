package tsk2;

public class PC {
    private Cpu CPU;
    private Gpu GPU;
    private Ram RAM;
    private Monitor MONITOR;

    public PC(Cpu CPU, Gpu GPU, Ram RAM, Monitor MONITOR) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.MONITOR = MONITOR;
    }

    public Cpu getCPU() {
        return CPU;
    }

    public void setCPU(Cpu CPU) {
        this.CPU = CPU;
    }

    public Gpu getGPU() {
        return GPU;
    }

    public void setGPU(Gpu GPU) {
        this.GPU = GPU;
    }

    public Ram getRAM() {
        return RAM;
    }

    public void setRAM(Ram RAM) {
        this.RAM = RAM;
    }
    public Monitor getMONITOR() {
        return MONITOR;
    }

    public void setMONITOR(Monitor MONITOR) {
        this.MONITOR = MONITOR;
    }
    @Override
    public String toString() {
        return "PC{" +
                "CPU=" + CPU +
                ", GPU=" + GPU +
                ", RAM=" + RAM +
                '}';
    }
}


