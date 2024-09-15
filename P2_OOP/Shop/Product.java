public class Product{
  public int index;
  public String name;
  public int cost;

  public Product(){
    
  }
  public Product(int index, String name, int cost){
    this.index = index;
    this.name = name;
    this.cost = cost;
  }


  public void setName(String name){
    this.name = name;
  }


  public void setCost(int cost) {
    this.cost = cost;
  }

}


