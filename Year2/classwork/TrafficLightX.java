package Year2.classwork;

import javax.swing.*;
import java.awt.*;

public class TrafficLightX {
    JFrame f;
    JPanel p;
    JLabel redLight;
    JLabel yellowLight;
    JLabel greenLight;

    public TrafficLightX() {
        create();
    }

    public static void main(String[] args) throws InterruptedException {
        TrafficLightX ob = new TrafficLightX();
        ob.automate();
    }

    public void create() {
        f = new JFrame("Traffic Light");
        f.setSize(400, 500);
        f.setLayout(new GridLayout(3, 1));

        redLight = new JLabel();
        redLight.setOpaque(true);
        redLight.setBackground(Color.BLACK);
        redLight.setSize(100, 100);
        f.add(redLight);

        yellowLight = new JLabel();
        yellowLight.setOpaque(true);
        yellowLight.setBackground(Color.BLACK);
        yellowLight.setSize(100, 100);
        f.add(yellowLight);

        greenLight = new JLabel();
        greenLight.setOpaque(true);
        greenLight.setBackground(Color.BLACK);
        greenLight.setSize(100, 100);
        f.add(greenLight);

        f.setVisible(true);

    }

    public void automate(){
        while (true) {
            try {
                setRed();
                Thread.sleep(2000);
                setYellow();
                Thread.sleep(2000);
                setGreen();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setRed() {
        redLight.setBackground(Color.red);
        yellowLight.setBackground(Color.gray);
        greenLight.setBackground(Color.gray);
    }

    public void setYellow() {
        redLight.setBackground(Color.gray);
        yellowLight.setBackground(Color.yellow);
        greenLight.setBackground(Color.gray);
    }

    public void setGreen() {
        redLight.setBackground(Color.gray);
        yellowLight.setBackground(Color.gray);
        greenLight.setBackground(Color.green);
    }
}
