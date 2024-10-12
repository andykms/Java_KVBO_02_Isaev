public class Shape {
  public double side = 0; // сторона для прямоугольника или квадрата
  public double radius = 0; // радиус для круга

  public Shape() {
  }

  // Метод для получения типа фигуры
  public String getType() {
      return "Shape";
  }

  // Методы для вычисления площади и периметра фигуры
  public double getArea() {
      return 0;
  }

  public double getPerimeter() {
      return 0;
  }
}
