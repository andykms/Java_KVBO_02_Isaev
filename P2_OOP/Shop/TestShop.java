import java.util.Scanner;

public class TestShop{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите название магазина: ");
    String name = sc.nextLine();
    Shop shop1 = new Shop(name);
    System.out.println("Введите количество новых товаров");
    String string_len = sc.nextLine();
    int len = Integer.parseInt(string_len);
    for(int i = 0; i< len; i++){
      System.out.println("Товар " + i +":\n");
      System.out.println("Введите наименование товара: ");
      String name_product = sc.nextLine();
      System.out.println("\nВведите стоимость товара: ");
      String cost_product_string = sc.nextLine();
      int cost_product = Integer.parseInt(cost_product_string);
      shop1.addProduct(name_product, cost_product);
    }
    int r = 12;
    while(r != 0){
      System.out.println("\nДля выхода введите 0;\nдля добавления товара введите 1;\nдля удаления товара по индексу (индекса товара, не массива) введите 2;\nдля удаления товара(ов) по наименованию введите 3;\nдля поиска товара(ов) по наименованию введите 4;\nдля вывода всех товаров введите 5;\n");
      String r_string = sc.nextLine();
      r = Integer.parseInt(r_string);
      if (r == 0){
        break;
      }
      else if(r == 1){
        System.out.println("Введите наименование товара: ");
        String name_product = sc.nextLine();
        System.out.println("\nВведите стоимость товара: ");
        String cost_product_string = sc.nextLine();
        int cost_product = Integer.parseInt(cost_product_string);
        shop1.addProduct(name_product, cost_product);
      }
      else if(r == 2){
        System.out.println("Введите индекс товара: ");
        String index_product_string = sc.nextLine();
        int index_product = Integer.parseInt(index_product_string);
        shop1.deleteProduct_index(index_product);
      }
      else if(r == 3){
        System.out.println("Введите наименование товара: ");
        String name_product_string = sc.nextLine();
        shop1.deleteProduct_name(name_product_string);
      }
      else if(r == 4){
        System.out.println("Введите наименование товара: ");
        String name_product_string = sc.nextLine();
        System.out.println(shop1.searchComputer(name_product_string));
      }
      else if(r==5){
        System.out.println(shop1.toString());
      }
      else {
        continue;
      }
    }
  }
}