import java.util.ArrayList;
import java.util.List;

public class ShapeCanvas implements ShapeObserver {
    private final List<Shape> shapes = new ArrayList<>();

    @Override
    public void onShapeChange(Shape shape) {
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
        shape.attach(this);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
        shape.detach(this);
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}