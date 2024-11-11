import java.util.ArrayList;
import java.util.Arrays;

public class Z4_Test_Shirt {
  public static void main(String[] args) {


    ArrayList<String> shirts = new ArrayList<String>();
    shirts.add("S001,Black Polo Shirt,Black,XL");
    shirts.add("S002,Black Polo Shirt,Black,L");
    shirts.add("S003,Blue PoloShirt,Blue,XL");
    shirts.add("S004,Blue Polo Shirt,Blue,M");
    shirts.add("S005,Tan PoloShirt,Tan,XL");
    shirts.add( "S006,Black T-Shirt,Black,XL");
    shirts.add( "S007,White TShirt,White,XL");
    shirts.add("S008,White T-Shirt,White,L");

    ArrayList<Z4_Shirt> class_shirts = new ArrayList<Z4_Shirt>();
    // Преобразуем массив строк в массив объектов Shirt
    for (int i = 0; i < shirts.size(); i++) {
        String[] parts = shirts.get(i).split(",");
        class_shirts.add(new Z4_Shirt(parts[0], parts[1], parts[2], parts[3]));
    }

    // Выводим массив на консоль
    System.out.println("Array of Shirts:");
    for (Z4_Shirt shirt : class_shirts) {
        System.out.println(shirt);
    }
}
}