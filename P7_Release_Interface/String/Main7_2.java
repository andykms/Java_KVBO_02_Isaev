public class Main7_2 {
  public static void main(String[] args) {
      StringManipulator stringManipulator = new StringManipulatorImpl();

      String testString = "Один скажет... МИЛЛИОНЫ ПОВТОРЯТ: ";
      for(int i =0; i< 999; i++){
        testString+="КИБ! ";
      }
      System.out.println("Исходная строка: " + testString);
      // Подсчет символов
      int characterCount = stringManipulator.countCharacters(testString);
      System.out.println("Количество символов: " + characterCount);

      // Получение символов на нечетных позициях
      String oddPositionChars = stringManipulator.getOddPositionChars(testString);
      System.out.println("Символы на нечетных позициях: " + oddPositionChars);

      // Инвертирование строки
      String reversedString = stringManipulator.reverseString(testString);
      System.out.println("Инвертированная строка: " + reversedString);
  }
}