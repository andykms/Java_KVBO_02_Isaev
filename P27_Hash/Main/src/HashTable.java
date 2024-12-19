import java.util.LinkedList;

//ЗАДАНИЕ 1 - КЛАСС С ФУНКЦИЯМИ ХЭЩ-ТАБЛИЦЫ
class HashTable<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry<K, V>>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int hash(K key) {
        return key.hashCode() % table.length;
    }

    public void add(K key, V value) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновляем значение, если ключ уже существует
                return;
            }
        }
        table[index].add(new Entry<>(key, value));
        size++;
    }

    public V lookup(K key) {
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null; // Если ключ не найден
    }

    public void delete(K key) {
        int index = hash(key);
        Entry<K, V> toDelete = null;
        for (Entry<K, V> entry : table[index]) {
            if (entry.key.equals(key)) {
                toDelete = entry;
                break;
            }
        }
        if (toDelete != null) {
            table[index].remove(toDelete);
            size--;
        }
    }

    public int size() {
        return size;
    }
}

