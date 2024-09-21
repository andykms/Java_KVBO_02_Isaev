import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class formate{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r = 12;
    while(r!=0){
      System.out.println("Для выхода введите 0, для продолжения любое другое число");
      String r_str = sc.nextLine();
      r = Integer.parseInt(r_str);
      if(r!=0){
        System.out.println("Введите число в валюте 1, которое необходимо перевести");
        String money_str = sc.nextLine();
        double money = Double.parseDouble(money_str);
        System.out.println("Введите курс валюты (Валюта 2 по отношению к валюте 1)");
        String course_str = sc.nextLine();
        double course = Double.parseDouble(course_str);
        System.out.printf("Итого: %2.2f\n", money * course);
      }
    }
  }
}