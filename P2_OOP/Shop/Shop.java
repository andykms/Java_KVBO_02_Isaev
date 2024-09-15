import java.util.ArrayList;
import java.util.List;

public class Shop{
  private List <Product> warehouse = new ArrayList<Product>();
  private int lastindex = 0;
  private String NameShop;

  public Shop(String NameShop){
    this.NameShop = NameShop;
  }

  public void addProduct(String name, int cost){
    this.warehouse.add(new Product(this.lastindex, name, cost));
    this.lastindex+=1;
  }


  public void deleteProduct_index(int input_index){
    List <Product> newwarehouse = new ArrayList <Product>();
    for(int i = 0; i< this.warehouse.size(); i++){
      if(this.warehouse.get(i).index != input_index){
        newwarehouse.add(new Product(this.warehouse.get(i).index, this.warehouse.get(i).name, this.warehouse.get(i).cost));
      }
    }
    this.warehouse = newwarehouse;
  }


  public void deleteProduct_name(String input_name){
    List <Product> newwarehouse = new ArrayList <Product>();
    for(int i = 0; i< this.warehouse.size(); i++){
      if(!(this.warehouse.get(i).name.equals(input_name))){
        newwarehouse.add( new Product(this.warehouse.get(i).index, this.warehouse.get(i).name, this.warehouse.get(i).cost));
      }
    }
    this.warehouse = newwarehouse;
  }


  public String searchComputer(String input_name){
    String searching = "";
    int lenn = 0;
    for(int i = 0; i < this.warehouse.size(); i++){
      if(this.warehouse.get(i).name.equals(input_name)){
        searching+="\nТовар: " + this.warehouse.get(i).name + "\n"
        + "Индекс товара: " + this.warehouse.get(i).index + "\n"
        + "Стоимость: " + this.warehouse.get(i).cost + "\n";
        lenn+=1;
      }
    }
    return "\nНайдено " + lenn + " предложений:" + searching;

  }

  public String toString(){
    String searching = "";
    for(int i = 0; i < this.warehouse.size(); i++){
        searching+="\n|Товар: " + this.warehouse.get(i).name + "\n"
        + "|Индекс товара: " + this.warehouse.get(i).index + "\n"
        + "|Стоимость: " + this.warehouse.get(i).cost + "\n\n";
    }
    return searching;
  }
}