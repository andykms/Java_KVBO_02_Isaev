class Table extends Furniture {
  private int numberOfLegs;

  public Table(String name, double price, int numberOfLegs) {
      super(name, price);
      this.numberOfLegs = numberOfLegs;
  }

  @Override
  public void displayInfo() {
      System.out.println("Table: " + getName() + ", Price: " + getPrice() + ", Legs: " + numberOfLegs);
  }
}