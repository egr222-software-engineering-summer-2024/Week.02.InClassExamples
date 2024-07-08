public class DigitSum {

    public static void main(String[] args) {
        int number = 29107;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));     // should return 19 (2+9+1+0+7)
        number = -456;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));     // should return 15 (4+5+6)

    }

    public static int digitSum(int num) {
        if (num == 0) return 0; // handle trivial solution
        if (num < 0) num *= -1; //make it a positive integer
        int sum = 0;    // initialize sum at zero (the default prior to summing any digits)

        while (num > 0) {
            int digit = num % 10; // extracts the last digit
            sum += digit;
            num /= 10;
        }

        return sum; // return the sum to calling program
    }
}