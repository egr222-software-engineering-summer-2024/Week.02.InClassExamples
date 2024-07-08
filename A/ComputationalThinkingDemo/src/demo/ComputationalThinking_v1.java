package demo;

public class ComputationalThinking_v1 {
    public static final double PI = 3.14159;
    
    public static void main(String[] args) {
        double area1;
        double area2;
        double area3;
        double area4;
        double area5;

        double radius;

        radius = 1;
        area1 = PI * radius * radius;
        radius = 2;
        area2 = PI * radius * radius;
        radius = 3;
        area3 = PI * radius * radius;
        radius = 4;
        area4 = PI * radius * radius;
        radius = 5;
        area5 = PI * radius * radius;

        System.out.println("area1 = " + area1);
        System.out.println("area2 = " + area2);
        System.out.println("area3 = " + area3);
        System.out.println("area4 = " + area4);
        System.out.println("area5 = " + area5);
    }
}
