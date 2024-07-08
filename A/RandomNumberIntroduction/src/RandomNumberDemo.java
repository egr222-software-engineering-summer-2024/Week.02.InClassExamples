import java.util.Random;

public class RandomNumberDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int count;

        int max;
        int min;
        int numberOfPossibleValues;
        int n;

        // To get a random number between 0 (inclusive) and 9 (inclusive)
//        System.out.println("\nGet Random Numbers in the range [0, 9]");
//        int randomNumber = rand.nextInt(10);  // returns a number between 0 and 9
//        System.out.println(randomNumber);

        // to get random numbers in the range [min, max] where max is INCLUSIVE
//        min = 4;
//        max = 10;
//        System.out.println("\nGet 20 Random Numbers in the Range [" + min + ", " + max + "] OR until " + max + " is returned");
//        numberOfPossibleValues = max - min + 1;
//
//        n = -1;
//        count = 0;
//        while (n != max) {
//            n = rand.nextInt(numberOfPossibleValues) + min;
//            System.out.println(n);
//            count++;
//            if (count > 20) break;
//        }

        // to get random ODD or EVEN numbers in the range [min, max] where max is INCLUSIVE
//        boolean even = false;
//        min = 6;
//        max = 19;
//        System.out.println("\nGet 20 Random " + (even ? "EVEN" : "ODD") + " Numbers in the Range [" + min + ", " + max + "] OR until " + max + " is returned");
//
//        // note - probably want to add a check to confirm that min < max because
//        // logic breaks if it isn't.

//        if (even) { // getting even numbers
//            if (min % 2 == 1) min = min + 1;  // min is odd so + 1 to make it even in the range
//            if (max % 2 == 1) max = max - 1;  // max is odd so - 1 to make it odd in the range
//        } else {    // getting odd numbers
//            if (min % 2 == 0) min = min + 1;  // min is even so + 1 to make it odd in the range
//            if (max % 2 == 0) max = max - 1;  // max is even so - 1 to make it odd in the range
//        }
//
//        numberOfPossibleValues = (max - min)/2 + 1;
//
//        n = -1;
//        count = 0;
//        while (n != max) {
//            n = rand.nextInt(numberOfPossibleValues) * 2 + min;
//            System.out.println(n);
//            count++;
//            if (count > 20) break;
//        }

        // to get a random REAL numbers in the range [min, max] where max is EXCLUSIVE (we can't ever get INCLUSIVE)
//
        double minGPA = 2.5;
        double maxGPA = 4.0;
        System.out.println("\nGet 20 Random GPA's (real numbers) in the range [" + minGPA + ", " + maxGPA + "]");

        double gpa = -1;
        for (int i=0; i < 20; i++) {
            gpa = rand.nextDouble() * (maxGPA - minGPA) + minGPA;
            System.out.println(gpa);
        }
    }
}