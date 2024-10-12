public class Main4_1{
    public static void main(String[] args){
        Shape fig = new Shape();
        System.out.println("Type: " + fig.getType());
        Circle circle1 = new Circle(5);
        System.out.println("Type" + circle1.getType()+ " S: " + circle1.getArea() + " P: " + circle1.getPerimeter());
        Rectangle rect1 = new Rectangle(5,5);
        System.out.println("Type" + rect1.getType()+ " S: " + rect1.getArea() + " P: " + rect1.getPerimeter());
        Square sq1 = new Square(3);
        System.out.println("Type" + sq1.getType()+ " S: " + sq1.getArea() + " P: " + sq1.getPerimeter());
    }
}

