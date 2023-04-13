package Year2.TestQuestions.Sample.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DetailsUI {
    DetailsUI(){
        JFrame frame = new JFrame("Personal Details");
        JPanel panel = new JPanel();

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel name = new JLabel("Name:");
        JTextField nameText = new JTextField(20);
        namePanel.add(name);
        namePanel.add(nameText);
        panel.add(namePanel);

        JButton save = new JButton("Save");
        save.setPreferredSize(new Dimension(100, 20));
        panel.add(save);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel,"Saved!");
            }
        });

        JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel dob = new JLabel("DOB:");
        //DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        //JFormattedTextField dobField = new JFormattedTextField(df);
        JTextField dobField = new JTextField(20);
        dobPanel.add(dob);
        dobPanel.add(dobField);
        panel.add(dobPanel);

        JButton close = new JButton("Close");
        close.setPreferredSize(new Dimension(100, 20));
        panel.add(close);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(400,200);
    }

    public static void main(String[] args){
        new DetailsUI();
    }
}
