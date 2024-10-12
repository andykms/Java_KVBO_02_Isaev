class Chair extends Furniture {
  private String material;

  public Chair(String name, double price, String material) {
      super(name, price);
      this.material = material;
  }

  @Override
  public void displayInfo() {
      System.out.println("Chair: " + getName() + ", Price: " + getPrice() + ", Material: " + material);
  }
}