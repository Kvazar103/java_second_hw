package tsk2;

public class Ram {
    private int memory;
    private RAM_Brand brand;
    private RAM_MemoryType memoryType;

    public Ram(int memory, RAM_Brand brand, RAM_MemoryType memoryType) {
        this.memory = memory;
        this.brand = brand;
        this.memoryType = memoryType;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public RAM_Brand getBrand() {
        return brand;
    }

    public void setBrand(RAM_Brand brand) {
        this.brand = brand;
    }

    public RAM_MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(RAM_MemoryType memoryType) {
        this.memoryType = memoryType;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "memory=" + memory +
                ", brand=" + brand +
                ", memoryType=" + memoryType +
                '}';
    }
}
