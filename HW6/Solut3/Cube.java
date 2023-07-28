package HW6.Solut3;

// Реализация трехмерной фигуры - куб
public class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}