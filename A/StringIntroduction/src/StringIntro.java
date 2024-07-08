public class StringIntro {
    public static void main(String[] args) {
        String starz = "Yeezy & Hova";
        System.out.println(starz.length());             // 12
        System.out.println(starz.indexOf("ee"));        // 1
        System.out.println(starz.substring(3,5));       // "zy"
        System.out.println(starz.substring(5));         // " & Hova"
        System.out.println(starz.toLowerCase());        // "yeezy & hova"
        System.out.println(starz.toUpperCase());        // "YEEZY & HOVA"


        // index     012345678901
        String s1 = "Stuart Reges";
        String s2 = "Marty Stepp";

        System.out.println(s1.length());         // 12
        System.out.println(s1.indexOf("e"));     // 8
        System.out.println(s1.substring(7, 10)); // "Reg“

        String s3 = s2.substring(1, 7);
        System.out.println(s3.toLowerCase());    // "arty s"

        // index       0123456789012345678901
        String book = "Building Java Programs";
        // How can we extract the word "Java"?
        System.out.println(book.substring(9,13));   // Note that the second index is EXCLUSIVE

        String s = "Ace";
        s.toUpperCase();
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);
    }
}
