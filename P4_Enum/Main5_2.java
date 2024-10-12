
public class Main5_2 {
    public enum Brand {
    DELL, HP, ASUS;
  }

  public class Processor{
    private int cores = 8;
    private int threads = 20;
    private int cash_mb = 10;
    private String model = "Basic MIREA CORE 1.0";
    public void Processor(){

    }
    public String getModel(){
      return model;
    }
  }

  public class Memory{
    private int amount_kB = 4096;
    public void Memory(){

    }

    public String getVolume(){
      return amount_kB + " Кб";
    }
  }

  public class Monitor{
    private int width = 1920;
    private int height = 1080;
    private int Hz = 60;
    private int duim = 5;
    public void Monitor(){

    }
    public int getDiagonal(){
      return duim;
    }

    public String getWidth(){
      return width;
    }

    public String getHeight(){
      return height;
    }
  }

  public class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand) {
        this.brand = brand;
        processor = new Processor();
        memory = new Memory();
        monitor = new Monitor();
    }

    // Геттеры и сеттеры

    public String getDescription() {
        return "Марка: " + brand + ", Процессор: " + processor.getModel() + ", Память: " + memory.getVolume() + " ГБ, Монитор: " + monitor.getDiagonal() + " дюймов, разрешение: " + monitor.getWidth() + "x" + monitor.getHeight();
    }
  }
  public static void main(String[] args){
    Brand new_brand = Brand.ASUS;
    Computer my_comp = new Computer(new_brand);
    System.out.println(my_comp.getDescription());
  }
}