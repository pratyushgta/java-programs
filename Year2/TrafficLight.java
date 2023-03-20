package Year2;

import java.awt.*;
import javax.swing.*;

public class TrafficLight {
    private JFrame mainFrame;
    private JPanel controlPanel;
    private JLabel redLabel;
    private JLabel yellowLabel;
    private JLabel greenLabel;

    public TrafficLight() {
        prepareGUI();
    }

    public static void main(String[] args) {
        TrafficLight trafficLightSimulator = new TrafficLight();
        trafficLightSimulator.showTrafficLight();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Traffic Light Simulator");
        mainFrame.setSize(400, 600);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(controlPanel);

        redLabel = new JLabel();
        redLabel.setOpaque(true);
        redLabel.setBackground(Color.gray);
        redLabel.setPreferredSize(new Dimension(100, 100));
        controlPanel.add(redLabel);

        yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(Color.gray);
        yellowLabel.setPreferredSize(new Dimension(100, 100));
        controlPanel.add(yellowLabel);

        greenLabel = new JLabel();
        greenLabel.setOpaque(true);
        greenLabel.setBackground(Color.gray);
        greenLabel.setPreferredSize(new Dimension(100, 100));
        controlPanel.add(greenLabel);

        mainFrame.setVisible(true);
    }

    private void showTrafficLight() {
        while (true) {
            try {
                setRed();
                Thread.sleep(5000);
                setGreen();
                Thread.sleep(5000);
                setYellow();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void setRed() {
        redLabel.setBackground(Color.red);
        yellowLabel.setBackground(Color.gray);
        greenLabel.setBackground(Color.gray);
    }

    private void setYellow() {
        redLabel.setBackground(Color.gray);
        yellowLabel.setBackground(Color.yellow);
        greenLabel.setBackground(Color.gray);
    }

    private void setGreen() {
        redLabel.setBackground(Color.gray);
        yellowLabel.setBackground(Color.gray);
        greenLabel.setBackground(Color.green);
    }
}
