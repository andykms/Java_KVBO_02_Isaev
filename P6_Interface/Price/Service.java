class Service implements Priceable {
  private String name;
  private double price;

  public Service(String name, double price) {
      this.name = name;
      this.price = price;
  }

  @Override
  public double getPrice() {
      return price;
  }

  @Override
  public String toString() {
      return "Service: " + name + ", Price: " + price;
  }

}