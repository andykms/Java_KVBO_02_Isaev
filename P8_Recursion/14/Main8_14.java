import java.util.Scanner;
import java.lang.Math;


public class Main8_14{
  public static void numbers(int N){
    int s =  N%10;
    System.out.println(s);
    N = (int)N/10;
    if(N == 0){
      return;
    }
    else{
      numbers(N);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Введите число: ");
    int N = sc.nextInt();
    numbers(N);
  }

}