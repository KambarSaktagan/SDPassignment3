public abstract class Shape {
    protected String id;
    protected Renderer renderer; // The interface-typed reference connecting the hierarchies

    public Shape(String id, Renderer renderer) {
        this.id = id;
        this.renderer = renderer;
    }

    public void setImplementation(Renderer renderer) {
        this.renderer = renderer;
    }

    public String getId() {
        return id;
    }

    public abstract String execute();
}