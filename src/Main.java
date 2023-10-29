public class Main {
    public static void main(String[] args) {
        ShapeCanvas canvas = new ShapeCanvas();

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(20, 30);

        canvas.addShape(circle);
        canvas.addShape(rectangle);

        circle.setRadius(20);
        rectangle.setWidth(40);

        canvas.draw();
    }
}