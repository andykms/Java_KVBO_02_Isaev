public class Main7_1 {
  public static void main(String[] args) {
      MathFunc mathFunc = new MathFunc();
      
      // Пример использования метода power
      double base = 2.0;
      double exponent = 3.0;
      double resultPower = mathFunc.power(base, exponent);
      System.out.println(base + " в степени " + exponent + " = " + resultPower);

      // Пример использования метода modulus
      double realPart = 3.0;
      double imaginaryPart = 4.0;
      double resultModulus = mathFunc.modulus(realPart, imaginaryPart);
      System.out.println("Модуль комплексного числа (" + realPart + " + " + imaginaryPart + "i) = " + resultModulus);

      // Пример вычисления длины окружности
      double radius = 5.0;
      double circumference = mathFunc.calculateCircumference(radius);
      System.out.println("Длина окружности с радиусом " + radius + " = " + circumference);
  }
}