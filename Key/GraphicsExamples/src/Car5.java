import java.awt.*;

public class Car5 {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(260, 180);
        panel.setBackground(Color.LIGHT_GRAY);

        Graphics g = panel.getGraphics();
        drawCar(g, 10, 30);
        drawCar(g, 150, 10, 50);

        for (int i = 0; i < 5; i++) {
            drawCar(g, 10 + i * 50, 130, 40);
        }
    }

    /*
    * Draws a car at the given x/y coordinates with the given width.
    * @param g the Graphics object to draw with
    * @param x the x coordinate of the top left corner of the car
    * @param y the y coordinate of the top left corner of the car
    *
    * The width of the car is 100 pixels and the height is 50 pixels.
     */
    public static void drawCar(Graphics g, int x, int y) {
        drawCar(g, x, y, 100);
    }

    /*
     * Draws a car at the given x/y coordinates with the given width.
     * @param g the Graphics object to draw with
     * @param x the x coordinate of the top left corner of the car (in pixels)
     * @param y the y coordinate of the top left corner of the car (in pixels)
     * @param width the width of the car (in pixels).  The height is half the width.
     */
    public static void drawCar(Graphics g, int x, int y, int width) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, width / 2);

        g.setColor(Color.RED);
        g.fillOval(x + width / 10, y + 2 * width / 5, width / 5, width / 5);
        g.fillOval(x + 7 * width / 10, y + 2 * width / 5, width / 5, width / 5);

        g.setColor(Color.CYAN);
        g.fillRect(x + 7 * width / 10, y + width / 10, 3 * width / 10, width / 5);
    }
}