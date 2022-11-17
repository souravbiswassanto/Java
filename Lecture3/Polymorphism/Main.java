package Lecture3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        shape.area();

        Circle circle = new Circle();
        circle.area();

        Shapes circleShape = new Circle();
        circleShape.area();
    }
}
