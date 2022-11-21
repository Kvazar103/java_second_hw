package tsk2;

public class Main {
    public static void main(String[] args) {
        PC pc=new PC(new Cpu(CPU_Brand.INTEL,"i3",3.1),
                new Gpu("Asus",GPU_Brand.NVIDIA,954,8),
                new Ram(8,RAM_Brand.Corsair,RAM_MemoryType.DDR4),
                new Monitor(27,4000,144,Monitor_Brand.LG));

//        System.out.println(pc);
        Laptop laptop=new Laptop(
                new Cpu(CPU_Brand.AMD,"rdfs",4),
                new Gpu("Gigabyte",GPU_Brand.NVIDIA,1000,10),
                new Ram(16,RAM_Brand.GSKill,RAM_MemoryType.DDR5),
                new Monitor(16,2560,75,Monitor_Brand.INTEGRATED),2,8);
//        System.out.println(laptop);

       Ultrabook ultrabook= new Ultrabook(
                new Cpu(CPU_Brand.INTEL,"i7",4.2),
                new Gpu("ASUS",GPU_Brand.NVIDIA,2000,12),
                new Ram(8,RAM_Brand.Corsair,RAM_MemoryType.DDR5),
                new Monitor(12,2560,60,Monitor_Brand.INTEGRATED),
                2,8,1.5
        );
//       System.out.println(ultrabook);
        Workstation workstation=new Workstation(
                new Cpu(CPU_Brand.INTEL,"i9",4.8),
                new Gpu("GIGABYTE",GPU_Brand.NVIDIA,2000,20),
                new Ram(32,RAM_Brand.Corsair,RAM_MemoryType.DDR5),
                new Monitor(30,8000,250,Monitor_Brand.LG),true);

        System.out.println(workstation);
    }
}
