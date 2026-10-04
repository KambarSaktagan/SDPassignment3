public class VectorRenderer implements Renderer {
    @Override
    public String renderShape(String shapeName, int dimension) {
        return "VECTOR " + shapeName + " i=" + dimension;
    }
}