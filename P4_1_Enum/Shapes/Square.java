public class Square extends Rectangle {
  
      public Square(double size) {
          super(size, size);
      }
  
      @Override
      public String getType() {
          return "Square";
      }

  }
  