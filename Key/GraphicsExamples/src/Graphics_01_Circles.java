import java.awt.*;

public class Graphics_01_Circles {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400,300);
        panel.setBackground(Color.YELLOW);
        Graphics g = panel.getGraphics();

        g.setColor(Color.RED);
        for (int i = 1; i <= 10; i++) {
            g.fillOval(100 +20 * i, 5 + 20 * i, 50, 50);
        }
    }
}
