package Inheritance3;

public class Test {
    public static void main(String[] args) {
        Shape line = new Line();
        Shape rect = new Rect();
        Shape circle = new Circle();

        line.draw();
        rect.draw();
        circle.draw();
    }
}
