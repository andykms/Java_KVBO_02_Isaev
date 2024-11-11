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