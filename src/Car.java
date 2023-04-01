import java.awt.Graphics;
import java.awt.Color;

public class Car {
    private Color bodyColor;

    public Car(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void drawVehicle(Graphics g) {
        g.setColor(bodyColor);
    }
}
