import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();

        int r = rand.nextInt(3) + 0;	// zero included for teaching purposes only
        if (r == 0) {
            System.out.println("Rock");
        } else if (r == 1) {
            System.out.println("Paper");
        } else {  // r == 2 (we don’t need to test for 2)
            System.out.println("Scissors");
        }
    }
}
