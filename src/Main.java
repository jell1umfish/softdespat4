public class Main {
    public static void main(String[] args) {
        String shapeType = "circle";
        Shape shape = ShapeFactory.createShape(shapeType);
        shape.draw();
    }
}