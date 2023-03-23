/**
 * This class contains methods for implementing a traffic light using Swing
 * OOPJ-E7-Q1
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import javax.swing.*;
import java.awt.*;

public class TrafficLight {
    JFrame f;
    JLabel redLight;
    JLabel yellowLight;
    JLabel greenLight;

    public void create() {
        f = new JFrame("ReadySetPo");
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
    public static void main(String[] args) throws InterruptedException {
        TrafficLight ob = new TrafficLight();
        ob.create();
        ob.automate();
    }
}
