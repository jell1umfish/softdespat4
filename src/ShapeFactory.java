public class ShapeFactory{
    public static Shape createShape(String shapeType) {
        return switch (shapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> throw new IllegalArgumentException("Invalid shape type: " + shapeType);
        };
    }
}
