import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Car");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        Car car = new Car(Color.darkGray, 40, 100, 50, 150,
                            Color.BLACK, 20, 20, 10,
                            Color.red, 10,20);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g)
            {
                super.paintComponent(g);
                car.drawVehicle(g);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}