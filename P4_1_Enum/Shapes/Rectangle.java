public class Rectangle extends Shape {
  
  public Rectangle(double width, double height) {
      super();
      this.width = width;
      this.height = height;
  }

  private final double width;
  private final double height;

  @Override
  public String getType() {
      return "Rectangle";
  }

  @Override
  public double getArea() {
      return width * height;
  }

  @Override
  public double getPerimeter() {
      return (width + height) * 2;
  }
}