public class Mirror {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        border();
        topHalf();
        bottomHalf();
        border();
    }

    public static void border() {
        System.out.print("#");
        for (int equal=1; equal <= (4 * SIZE); equal++) {
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void topHalf() {
        for (int line=1; line<=SIZE; line++) {
            // contents of each line
            System.out.print("|");
            printString(" ", (-2 * line + (2 * SIZE)));
            System.out.print("<>");
            printString(".", (4 * line - 4));
            System.out.print("<>");
            printString(" ", (-2 * line + (2 * SIZE)));
            System.out.println("|");
        }
    }

    public static void bottomHalf() {
        for (int line=SIZE; line>=1; line--) {
            // contents of each line
            System.out.print("|");
            printString(" ", (-2 * line + (2 * SIZE)));
            System.out.print("<>");
            printString(".", (4 * line - 4));
            System.out.print("<>");
            printString(" ", (-2 * line + (2 * SIZE)));
            System.out.println("|");
        }
    }

    public static void printString(String str, int count) {
        for (int i=1; i<=count; i++) {
            System.out.print(str);
        }
    }
}