package soal1;

public abstract class Shape {
    protected String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}
