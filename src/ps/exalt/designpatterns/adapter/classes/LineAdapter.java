package ps.exalt.designpatterns.adapter.classes;

import ps.exalt.designpatterns.adapter.interfaces.Shape;

public class LineAdapter implements Shape {
    private Line adaptee;

    public LineAdapter(Line line) {
        adaptee = line;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
