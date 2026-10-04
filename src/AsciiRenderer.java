public class AsciiRenderer implements Renderer {
    @Override
    public String renderShape(String shapeName, int dimension) {
        return "ASCII " + shapeName + " i=" + dimension;
    }
}