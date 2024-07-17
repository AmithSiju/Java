public class CPU {
    double price;
    class Processor{
        int cores;
        String manufacturer;
        Processor(int cores,String man){
            this.cores = cores ;
            manufacturer = man;
        }
        void display(){
            System.out.print("\nPocessor info :");
            System.out.print("\nNo of Cores : "+cores);
            System.out.println("\nManufacturer : "+manufacturer);
        }
    }
    static class RAM{
        int memory;
        String manuf;
        RAM(int memory,String manuf){
            this.memory=memory;
            this.manuf=manuf;
        } 
        void display(){
            System.out.print("\nRam info : ");
            System.out.print("\nMemory :"+ memory + "GB");
            System.out.println("\nManufacturer : "+manuf);
        }
    }
    public static void main(String[] args) {
        CPU.RAM obj1 = new CPU.RAM(8,"Intel");
        CPU obj2 = new CPU();
        Processor obj3 = obj2.new Processor(1,"Samsung");

        obj3.display();
        obj1.display();
    }
}