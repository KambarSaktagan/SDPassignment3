public class Circle extends Shape {
    private final int radius = 2; // Domain data retained on the abstraction side

    public Circle(String id, Renderer renderer) {
        super(id, renderer);
    }

    @Override
    public String execute() {
        return renderer.renderShape("circle radius", radius); // Low-level operations delegated
    }
}