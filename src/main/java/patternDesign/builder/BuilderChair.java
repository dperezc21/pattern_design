package patternDesign.builder;

public class BuilderChair {

    private String material;
    private Long height;
    private Long legs;
    private String shape;
    private Long width;


    public BuilderChair setMaterial(String material) {
        this.material = material;
        return this;
    }
    public BuilderChair setHeight(Long height) {
        this.height = height;
        return this;
    }
    public BuilderChair setWidth(Long width) {
        this.width = width;
        return this;
    }
    public BuilderChair setShape(String shape) {
        this.shape = shape;
        return this;
    }

    public BuilderChair setLegs(Long legs) {
        this.legs = legs;
        return this;
    }

    public void Build() {
        System.out.println("material: " + this.material
                            + "shape: " + this.shape
                            + "legs: " + this.legs
                            + "height: " + this.height
                            + "width: " + this.width);
    }
}
