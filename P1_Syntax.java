import java.util.Scanner;

public class P1_Syntax {

  public static int summ(int[] arr_summ){
    int summ = 0;
    for(int h = 0; h< arr_summ.length; h++){
      summ += arr_summ[h];
    }
    return summ;
  }

  public static float sr_arifm(int[] arr_summ){
    return ((float)summ(arr_summ))/(float)(arr_summ.length);
  }

  public static int factorial(int arr1){
    int p = 1;
    if (arr1 > 0){
      for(int i = 1; i<=arr1; i++){
        p*= i;
      }
    }
    else if (arr1 == 0){
      p = 1;
    }
    else{
      System.out.println("Введено некорректное значение");
      p = arr1;
    }
    return p;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите размерность массива: ");
    String len = sc.nextLine();
    int len_int = Integer.parseInt(len);
    int arr[] = new int[len_int];
    for(int i = 0; i<len_int; i++){
      System.out.printf("Введите элемент массива под индексом %d: ", i);
      String vvod = sc.nextLine();
      int vvod_int = Integer.parseInt(vvod);
      arr[i] = vvod_int;
    }
    System.out.printf("Сумма элементов: %d; Среднее арифметическое: %f", summ(arr), sr_arifm(arr));
    System.out.printf("\nВведите число, у которого хотите посчитать факториал: ");
    String vvod_index = sc.nextLine();
    int vvod_index_int = Integer.parseInt(vvod_index);
    System.out.printf("Факториал числа %d равно: %d", vvod_index_int, factorial(vvod_index_int));
    System.out.println("\nГармонический ряд: ");
    for(int i = 1; i <11; i++){
      System.out.printf("\n%d число гармонического ряда: %.3f", i, 1/(float)i);
    }
  }
}