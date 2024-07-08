import java.awt.*;

public class Graphics_03_RectangleStairs {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(160, 160);
        Graphics g = panel.getGraphics();

        for (int i = 0; i < 10; i++) {
            g.drawRect(20, 20 + 10 * i, 100 - 10 * i, 10);  // initial version
//            g.drawRect(110 - 10 * i, 110 - 10 * i, 10 * (i + 1), 10);  // second variation
//            g.drawRect(110 - 10 * i, 20 + 10 * i, 10 + 10 * i, 10);   // final variation
        }
    }
}
