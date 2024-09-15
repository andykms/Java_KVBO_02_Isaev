
public class TestAuthor {
  public static void main(String[] args){
    Author Isaev = new Author("Andrey", "joinday08@gmail.com", 'm');
    System.out.println(Isaev.getName());
    System.out.println(Isaev.getEmail());
    System.out.println(Isaev.getGender());
    Isaev.setEmail("Isaev.a.v4@edu.mirea.ru");
    System.out.println(Isaev.toString());
    

  }
}