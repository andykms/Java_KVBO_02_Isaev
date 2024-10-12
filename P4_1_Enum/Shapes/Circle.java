public class Circle extends Shape {
  
  public Circle(double radius) {
      super();
      super.radius = radius;
  }

  @Override
  public String getType() {
      return "Circle";
  }

  @Override
  public double getArea() {
      return Math.PI * radius * radius;
  }

  @Override
  public double getPerimeter() {
      return 2 * Math.PI * radius;
  }
}