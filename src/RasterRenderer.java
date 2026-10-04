public class RasterRenderer implements Renderer {
    @Override
    public String renderShape(String shapeName, int dimension) {
        return "RASTER " + shapeName + " i=" + dimension;
    }
}