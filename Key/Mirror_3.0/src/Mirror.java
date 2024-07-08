public class Mirror {
    public static final int SIZE = 6;

    public static void main(String[] args) {
        border();
        topHalf();
        bottomHalf();
        border();
    }

    private static void bodyPattern(int line) {
        System.out.print("|");
        for (int i=1; i<=-2*line+(2*SIZE); i++) {
            System.out.print(" ");
        }
        System.out.print("<>");
        for (int i=1; i<=4*line-4; i++) {
            System.out.print(".");
        }
        System.out.print("<>");
        for (int i=1; i<=-2*line+(2*SIZE); i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void topHalf() {
        for (int line = 1; line <= SIZE; line++) {
            bodyPattern(line);
        }
    }

    public static void bottomHalf() {
        for (int line = SIZE; line >= 1; line--) {
            bodyPattern(line);
        }
    }

    public static void border() {
        System.out.print("|");
        for (int i=1; i<=4*SIZE; i++) {
            System.out.print("=");
        }
        System.out.println("|");
    }
}