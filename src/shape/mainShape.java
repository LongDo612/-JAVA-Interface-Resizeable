package shape;

import java.util.ArrayList;

public class mainShape {
    public static void main(String[] args) {
        ArrayList<Shape> array = new ArrayList<>();
        Circle circle = new Circle(10);
        System.out.println("Radius before resize:");
        System.out.println(circle.getRadius());
        circle.resize(getRandom());
        System.out.println("Radius after resize:");
        System.out.println(circle.getRadius());
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("Rectangle: width and length before resize:");
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        rectangle.resize(getRandom());
        System.out.println("Rectangle: width and length after resize:");
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        Square square = new Square(10);
        System.out.println("Square: side before resize:");
        System.out.println(square.getSide());
        square.resize(getRandom());
        System.out.println("Square: side after resize:");
        System.out.println(square.getSide());
    }

    public static double getRandom(){
        return Math.floor(Math.random()*100);
    }
}
