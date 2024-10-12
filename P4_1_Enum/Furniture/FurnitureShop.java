import java.util.ArrayList;
import java.util.List;

class FurnitureShop {
    private List<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    public void displayInventory() {
        System.out.println("Furniture Shop Inventory:");
        for (Furniture furniture : inventory) {
            furniture.displayInfo();
        }
    }
}