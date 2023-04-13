package Year2.TestQuestions.Sample.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame {
    NewFrame() {
        JFrame frame = new JFrame("Java Swing Examples");
        frame.setSize(500, 500);
        JLabel l1 = new JLabel("Container in action: JFrame");
        l1.setBounds(100, 60, 300, 30);

        JButton button = new JButton("Open a frame");
        button.setBounds(100, 100, 200, 30);
        JLabel l3 = new JLabel("A frame shown to the user.");
        l3.setBounds(100, 400, 300, 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame new_frame = new JFrame();
                new_frame.setSize(500, 500);
                JLabel l2 = new JLabel("Welcome to new JFrame!");
                l2.setHorizontalAlignment(SwingConstants.CENTER);
                l2.setBounds(100, 50, 300, 30);
                new_frame.add(l2);
                new_frame.setLayout(null);
                new_frame.setVisible(true);
            }
        });
        frame.add(l3);
        frame.add(l1, BorderLayout.NORTH);
        frame.add(button, BorderLayout.CENTER);
        frame.setLayout(null);
        frame.setVisible(true);

        //label1.setVerticalAlignment(JLabel.TOP);
        //label2.setVerticalAlignment(JLabel.TOP);
        //label3.setVerticalAlignment(JLabel.TOP);
    }

    public static void main(String[] args) {
        new NewFrame();
    }
}
