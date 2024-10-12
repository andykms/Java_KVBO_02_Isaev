public class Main4_1_2 {
  public static void main(String[] args) {
      // Создание объектов
      Person person1 = new Person();
      Person person2 = new Person("Иван Иванов", 30);

      // Вызов методов
      person1.move();
      person1.talk();

      person2.move();
      person2.talk();
  }
}