import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        NameCounter nameCounter = new NameCounter();
        // Вызываем методы, чтобы проверить количество одинаковых имен и фамилий
        int sameFirstNameCount = nameCounter.getSameFirstNameCount();
        int sameLastNameCount = nameCounter.getSameLastNameCount();

        System.out.println(sameFirstNameCount);
        System.out.println(sameLastNameCount);
    }
}

