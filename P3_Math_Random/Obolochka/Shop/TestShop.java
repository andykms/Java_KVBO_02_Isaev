import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;


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
    List <Product> Basket = new ArrayList<Product>();
    boolean status = false;
    int r = 12;
    while(r != 0){
      System.out.println("\nДля выхода введите 0;\nдля добавления товара введите 1;\nдля удаления товара по индексу (индекса товара, не массива) введите 2;\nдля удаления товара(ов) по наименованию введите 3;\nдля поиска товара(ов) по наименованию введите 4;\nдля вывода всех товаров введите 5;\nдля добавления товара в корзину (по имени) введите 6;\nдля вывода корзины введите 7;\nдля итоговой суммы введите 8 (!ВНИМАНИЕ - корзина опустошится!);\nдля выбора валюты введите 9;\n");
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
      else if(r == 2 && !(status)){
        System.out.println("Введите индекс товара: ");
        String index_product_string = sc.nextLine();
        int index_product = Integer.parseInt(index_product_string);
        shop1.deleteProduct_index(index_product);
      }
      else if(r == 3 && !(status)){
        System.out.println("Введите наименование товара: ");
        String name_product_string = sc.nextLine();
        shop1.deleteProduct_name(name_product_string);
      }
      else if((r == 2 || r == 3) && status){
        System.out.println("Удаление невозможно, корзина не пуста!");
      }
      else if(r == 4){
        System.out.println("Введите наименование товара: ");
        String name_product_string = sc.nextLine();
        System.out.println(shop1.searchComputer(name_product_string));
      }
      else if(r==5){
        System.out.println(shop1.toString());
      }
      else if(r == 6){
        System.out.println("Введите имя товара");
        String name_product_string = sc.nextLine();
        Product add_prod = shop1.searchComputer(name_product_string, true);
        if(add_prod.index != -1){
          Basket.add(shop1.searchComputer(name_product_string, true));
          status = true;
        }
        else{
          System.out.println("Товар не найден!");
        }
      }
      else if(r == 7){
        for(int i = 0; i < Basket.size(); i++){
          System.out.printf("\n|Товар %d: Наименование: %s, Цена: %d, Индекс: %d \n", i+1, Basket.get(i).name, Basket.get(i).cost, Basket.get(i).index);
        }
      }
      else if(r == 8){
        int summ = 0;
        for(int i = 0; i< Basket.size(); i++){
          summ+=Basket.get(i).cost;
        }
        System.out.println("Для оплаты в евро (не рекомендуется) введите 1, в юанях 2, в долларах (не рекомендуется) 3");
        String val_str = sc.nextLine();
        int val = Integer.parseInt(val_str);
        NumberFormat numberFormat1 = NumberFormat.getInstance(Locale.FRANCE);
        if(val == 1){
          numberFormat1 = NumberFormat.getInstance(Locale.FRANCE);
        } 
        else if(val == 2){
          numberFormat1 = NumberFormat.getInstance(Locale.CHINA);
        }
        else if(val == 3){
          numberFormat1 = NumberFormat.getInstance(Locale.US);
        }
        else{
          System.out.println("Введена неправильная валюта!");
          continue;
        }
        System.out.println("Итог: " + numberFormat1.format(summ));
        Basket = new ArrayList<Product>();
        status = true;
      }
      else {
        continue;
      }
    }
  }
}