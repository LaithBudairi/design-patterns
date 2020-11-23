package ps.exalt.designpatterns.adapter.classes;

import ps.exalt.designpatterns.adapter.interfaces.Shape;

public class RectangleAdapter implements Shape {
    private Rectangle adaptee;

    public RectangleAdapter(Rectangle rectangle) {
        adaptee = rectangle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2);
        int y = Math.min(y1, y2);
        int width = Math.abs(x1 - x2);
        int height = Math.abs(y1 - y2);

        adaptee.draw(x, y, width, height);
    }
}
