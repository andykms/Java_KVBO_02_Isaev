public class Person {
  // Поля класса
  private String fullName;
  private int age;

  // Конструктор по умолчанию
  public Person() {
      this.fullName = "Неизвестно";
      this.age = 0;
  }

  // Конструктор с параметрами
  public Person(String fullName, int age) {
      this.fullName = fullName;
      this.age = age;
  }

  // Метод для перемещения
  public void move() {
      System.out.println(fullName + " говорит: Я иду.");
  }

  // Метод для разговора
  public void talk() {
      System.out.println(fullName + " говорит: Привет!");
  }

  // Геттеры для полей (если необходимо)
  public String getFullName() {
      return fullName;
  }

  public int getAge() {
      return age;
  }
}