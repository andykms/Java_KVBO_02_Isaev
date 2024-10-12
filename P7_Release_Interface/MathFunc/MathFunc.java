public class MathFunc implements MathCalculable {

  @Override
  public double power(double base, double exponent) {
      return Math.pow(base, exponent);
  }

  @Override
  public double modulus(double realPart, double imaginaryPart) {
      return Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
  }
  
  // Метод для вычисления длины окружности
  public double calculateCircumference(double radius) {
      return 2 * PI * radius;
  }
}