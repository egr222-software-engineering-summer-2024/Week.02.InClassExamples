import java.awt.*;

public class Graphics_02_NestedLoopText {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(250, 250);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLUE);

        for (int x = 1; x <= 4; x++) {
            for (int y = 1; y <= 9; y++) {
                g.drawString("Java", x * 40, y * 25);
            }
        }
    }
}