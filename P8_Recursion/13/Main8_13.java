import java.util.Scanner;

public class Main8_12 {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String result = "";
        // Проверка условия завершения
        while(true){
          number = scanner.nextInt();
          count++;
          if(number == 0){
            break;
          }
          if(count%2 != 0){
            result+= number.String.toString() + " ";
          }
        }
        System.out.println(result);
    }
}