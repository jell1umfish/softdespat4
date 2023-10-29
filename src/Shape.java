import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    List<ShapeObserver> observers = new ArrayList<>();

    void attach(ShapeObserver observer) {
        observers.add(observer);
    }
    void detach(ShapeObserver observer) {
        observers.remove(observer);
    }
    void notifyObservers() {
        for (ShapeObserver observer : observers) {
            observer.onShapeChange(this);
        }
    }

    public abstract void draw();
}
