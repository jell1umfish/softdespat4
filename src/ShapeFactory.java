public class ShapeFactory{
    public static Shape createShape(String shapeType) {
        return switch (shapeType) {
            case "circle" -> new Circle(10);
            case "rectangle" -> new Rectangle(10,10);
            default -> throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        };
    }
}
