/**
 * This class contains methods for implementing table using Swing
 * OOPJ-E7-Q2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import javax.swing.*;
import java.awt.*;

public class Tables {
    public static void main(String[] args) {
        JFrame f;
        JTable t;
        int rows = 3;
        int cols = 3;

        f = new JFrame("FBI Data");

        GridLayout gl = new GridLayout(rows, cols);
        f.setLayout(gl);

        String[] data = {"Apples", "Bananas", "Coconuts",
                "Dragons", "Elephants", "Flapjack",
                "Grumpy", "Heavesworth", "Inklock"};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JLabel label = new JLabel(data[i*3+j],SwingConstants.CENTER);
                f.add(label);
            }
        }

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
