class Sofa extends Furniture {
  private int capacity;

  public Sofa(String name, double price, int capacity) {
      super(name, price);
      this.capacity = capacity;
  }

  @Override
  public void displayInfo() {
      System.out.println("Sofa: " + getName() + ", Price: " + getPrice() + ", Capacity: " + capacity + " persons");
  }
}