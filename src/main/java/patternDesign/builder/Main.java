package patternDesign.builder;

public class Main {
    public static void main(String[] args) {
        BuilderChair chair = new BuilderChair();
        chair.setLegs(4L)
                .setHeight(40L)
                .setWidth(30L)
                .setMaterial("wood")
                .setShape("square").Build();
    }
}
