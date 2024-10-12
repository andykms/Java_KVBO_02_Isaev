public class Main6_1 {
  public static void main(String[] args) {
      Priceable product = new Product("Laptop", 1200.00);
      Priceable service = new Service("Repair", 150.00);

      System.out.println(product.toString());
      System.out.println("Price of product: " + product.getPrice());
      System.out.println(service.toString());
      System.out.println("Price of service: " + service.getPrice());
  }
}