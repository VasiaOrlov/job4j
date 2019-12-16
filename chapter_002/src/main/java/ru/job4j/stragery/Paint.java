package ru.job4j.stragery;

public class Paint {
    public void draw(Shape shape) {
       System.out.println(shape.draw());
    }
    public static void main(String[] args) {
        Paint paint = new Paint();
        Shape shape = new Square();
        Shape shape1 = new Triangle();
        paint.draw(shape);
        paint.draw(shape1);
    }
}
