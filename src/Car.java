import java.awt.Graphics;
import java.awt.Color;

public class Car {
    private Color bodyColor;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;

    public Car(Color bodyColor, int height, int width, int xPosition, int yPosition) {
        this.bodyColor = bodyColor;
        this.height = height;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void drawVehicle(Graphics g) {
        g.setColor(bodyColor);
        g.fillRect(xPosition, yPosition, width, height);
    }
}
