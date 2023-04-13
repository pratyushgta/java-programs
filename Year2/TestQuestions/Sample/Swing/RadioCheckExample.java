package Year2.TestQuestions.Sample.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioCheckExample implements ItemListener, ActionListener{
    JRadioButton b1, b2;
    JCheckBox b3,b4;
    JLabel l2;
    JPanel panel;
    RadioCheckExample() {
        JFrame frame = new JFrame();
        frame.setSize(400, 200);
        panel = new JPanel();

        JLabel l1 = new JLabel("Select from the following: ");
        l2 = new JLabel("");
        b1 = new JRadioButton("Option 1");
        b2 = new JRadioButton("Option 2");
        b3 = new JCheckBox("Option 3");
        b4 = new JCheckBox("Option 4");

        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addItemListener(this);
        b4.addItemListener(this);

        panel.add(l1);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(l2);
        frame.add(panel);

        frame.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==b3)
            l2.setText("B3 Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
        else if (e.getSource()==b4) {
            l2.setText("B4 Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
            JOptionPane.showMessageDialog(panel,e.getActionCommand()+" selected!");
    }

    public static void main(String[] args) {
        new RadioCheckExample();
    }


}
