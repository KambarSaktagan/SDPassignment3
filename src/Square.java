public class Square extends Shape {
    private final int side = 3;

    public Square(String id, Renderer renderer) {
        super(id, renderer);
    }

    @Override
    public String execute() {
        return renderer.renderShape("square side", side);
    }
}