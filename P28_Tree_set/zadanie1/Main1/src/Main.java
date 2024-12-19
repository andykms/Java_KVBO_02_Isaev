import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Создаем HashSet и добавляем элементы
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Иван");
        hashSet.add("Петр");
        hashSet.add("Сидор");
        hashSet.add("Алексей");
        hashSet.add("Станислав");

        // Преобразуем HashSet в TreeSet
        Set<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("Hashset: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}