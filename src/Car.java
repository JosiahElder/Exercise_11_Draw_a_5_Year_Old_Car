import java.awt.Graphics;
import java.awt.Color;

public class Car {
    private Color bodyColor;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    //------------------------------------
    private Color tireColor;
    private int tireWidth;
    private int tireHeight;
    private int tireSpacing;
    //------------------------------------
    private Color carTopColor;
    private int topHeight;
    private int topWidth;


    public Car(Color bodyColor, int height, int width, int xPosition, int yPosition,
                Color tireColor, int tireWidth, int tireHeight, int tireSpacing,
                Color carTopColor, int topHeight, int topWidth)
    {
        this.bodyColor = bodyColor;
        this.height = height;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        //------------------------------------
        this.tireColor = tireColor;
        this.tireWidth = tireWidth;
        this.tireHeight = tireHeight;
        this.tireSpacing = tireSpacing;
        //------------------------------------
        this.carTopColor = carTopColor;
        this.topHeight = topHeight;
        this.topWidth = topHeight;
    }

    public void drawVehicle(Graphics g) {
        g.setColor(bodyColor);
        g.fillRect(xPosition, yPosition, width, height);
        //------------------------------------
        g.setColor(tireColor);
        g.fillOval(xPosition + tireSpacing,
                yPosition + height, tireWidth, tireHeight);
        g.fillOval(xPosition + width - tireSpacing - tireWidth,
                    yPosition + height, tireWidth, tireHeight);
        //------------------------------------
        g.setColor(carTopColor);
        g.fillRect(xPosition + 10 + topWidth, yPosition + topWidth + topHeight * (-2),
                    width - 4 * topWidth, topHeight);
        g.fillRect(xPosition, yPosition + topHeight, width, 5);
    }
}
