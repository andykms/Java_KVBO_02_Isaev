public class Main {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!");

        System.out.println("Элементы списка:");
        for (String element : myList) {
            System.out.println(element);
        }

        System.out.println("Размер списка: " + myList.size());
    }
}
