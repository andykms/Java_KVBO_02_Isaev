import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class ArrayRandom{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите размер массива");
    String lenn_str = sc.nextLine();
    int lenn = Integer.parseInt(lenn_str);
    double[] arrRandom = new double[lenn];
    Random rand = new Random();
    System.out.print("Массив, класс Random: |");
    for(int i = 0; i < lenn; i ++){
      arrRandom[i] = rand.nextDouble();
      System.out.printf("%.3f|", arrRandom[i]);
    }


    double[] arrMath = new double[lenn];
    System.out.print("\nМассив, класс Math: |");
    for(int i = 0; i < lenn; i ++){
      arrMath[i] = Math.random();
      System.out.printf("%.3f|", arrMath[i]);
    } 


    for (int left = 0; left < arrRandom.length; left++) {
      int minInd = left;
      for (int i = left; i < arrRandom.length; i++) {
        if (arrRandom[i] < arrRandom[minInd]) {
          minInd = i;
        }
      }
      double a = arrRandom[minInd];
      arrRandom[minInd] = arrRandom[left];
      arrRandom[left] = a;
    }
    System.out.print("\nМассив, класс Random (Отсортированный): |");
    for(int i = 0; i < lenn; i ++){
      System.out.printf("%.3f|", arrRandom[i]);
    }


    for (int left = 0; left < arrMath.length; left++) {
      int minInd = left;
      for (int i = left; i < arrMath.length; i++) {
        if (arrMath[i] < arrMath[minInd]) {
          minInd = i;
        }
      }
      double a = arrMath[minInd];
      arrMath[minInd] = arrMath[left];
      arrMath[left] = a;
    }
    System.out.print("\nМассив, класс Math (Отсортированный): |");
    for(int i = 0; i < lenn; i ++){
      System.out.printf("%.3f|", arrMath[i]);
    }
  }
}