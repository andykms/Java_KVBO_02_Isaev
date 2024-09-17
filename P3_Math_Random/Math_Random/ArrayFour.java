import java.util.Random;
import java.util.*;


public class ArrayFour{
    public static void main(String[] args){
        int[] arr = new int[4];
        Random rand = new Random();
        int last = 0;
        boolean k = false;
        while(k != true) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(89) + 10;
                if (last >= arr[i]) {
                    System.out.println("No");
                    continue;
                }
                last = arr[i];
            }
            System.out.println("Yes");
            k = true;
        }
    }
}