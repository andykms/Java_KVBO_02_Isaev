import java.util.HashMap;
import java.util.Map;


public class NameCounter {
    public Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Сидор");
        map.put("Кузнецов", "Иван");
        map.put("Смирнов", "Алексей");
        map.put("Попов", "Петр");
        map.put("Лебедев", "Сидор");
        map.put("Соболев", "Алексей");
        map.put("Морозов", "Иван");
        map.put("Федоров", "Станислав");
        return map;
    }

    // Метод для подсчета количества людей с одинаковыми именами
    public int getSameFirstNameCount() {
        Map<String, String> map = createMap();
        Map<String, Integer> nameCount = new HashMap<>();

        for (String firstName : map.values()) {
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }

        int count = 0;
        for (int value : nameCount.values()) {
            if (value > 1) {
                count += value; // Суммируем количество людей с одинаковыми именами
            }
        }
        return count;
    }

    // Метод для подсчета количества людей с одинаковыми фамилиями
    public int getSameLastNameCount() {
        Map<String, String> map = createMap();
        Map<String, Integer> lastNameCount = new HashMap<>();

        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        int count = 0;
        for (int value : lastNameCount.values()) {
            if (value > 1) {
                count += value; // Суммируем количество людей с одинаковыми фамилиями
            }
        }
        return count;
    }
}