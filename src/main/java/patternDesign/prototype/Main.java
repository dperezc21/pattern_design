package patternDesign.prototype;

/**
 * pattern designed prototype to game of birds
 * The birds have some characteristics in common such as flight speed, color, vertical position
 * depending on the difficulty of the game,
 * they could appear with different speeds to make the game more entertaining
 */
public class Main {
    public static void main(String[] args) {
        BirdPrototype bird = new BirdPrototype(20, 30);
        System.out.print("bird: ");
        bird.getBird();
        BirdPrototype birdCloned = (BirdPrototype) bird.clone(bird);
        birdCloned.setSpeed(16);
        System.out.print("bird cloned: ");
        birdCloned.getBird();
        bird.getBird();
    }
}
