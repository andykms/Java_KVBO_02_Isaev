public class Main {
  public static void main(String[] args) {
      FurnitureShop shop = new FurnitureShop();

      Chair chair = new Chair("Modern Chair", 120.50, "Wood");
      Table table = new Table("Dining Table", 250.00, 4);
      Sofa sofa = new Sofa("Leather Sofa", 700.00, 5);

      shop.addFurniture(chair);
      shop.addFurniture(table);
      shop.addFurniture(sofa);

      shop.displayInventory();
  }
}