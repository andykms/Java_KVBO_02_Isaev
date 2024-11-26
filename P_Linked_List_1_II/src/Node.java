import java.util.*;


public class Node {
  private String name;
  private int age;
  Node next = null;
  Node prev = null;
  public Node() {
      // Конструктор по умолчанию
      name = "";
      age = 0;
  }

  public Node(String name, int age){
    this.name = name;
    this.age = age;
  }

  // Функция для считывания атрибутов объекта с консоли
  public void readFromConsole() {
      System.out.print("Введите имя: ");
      Scanner scanner = new Scanner(System.in);
      this.name = scanner.nextLine();
      System.out.print("Введите возраст: ");
      this.age = scanner.nextInt();
  }

  // Функция для вывода атрибутов на экран
  public void printInfo() {
      System.out.printf("Имя: %s, Возраст: %d", name, age);
  }
}