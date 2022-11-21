package tsk2;

public class Workstation extends PC{
    private boolean DVD;

    public Workstation(Cpu CPU, Gpu GPU, Ram RAM, Monitor MONITOR,boolean DVD) {
        super(CPU, GPU, RAM, MONITOR);
        this.DVD=DVD;
    }

    public boolean isDVD() {
        return DVD;
    }

    public void setDVD(boolean DVD) {
        this.DVD = DVD;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "DVD=" + DVD + '\''+
                super.toString()+
                '}';
    }
}
