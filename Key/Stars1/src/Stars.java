public class Stars {
    public static void main(String[] args) {
        lineOf13();
        lineOf7();
        lineOf35();
        box10x3();
        box5x4();
    }

    public static void lineOf13() {
        for (int i = 1; i <= 13; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void lineOf7() {
        for (int i = 1; i <= 7; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void lineOf35() {
        for (int i = 1; i <= 35; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void box10x3() {
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("*");
        for (int i = 1; i <= 8; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void box5x4() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1; j <= 2; j++) {
            System.out.print("*");
            for (int i = 1; i <= 3; i++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}