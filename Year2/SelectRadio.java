/**
 * This class contains methods for implementing auto-disabling radio buttons
 * OOPJ-E7-Q3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectRadio {
    public static void main(String[] args){
        JFrame f;
        f = new JFrame("Bubbons");
        JRadioButton jr1 = new JRadioButton("IT");
        JRadioButton jr2 = new JRadioButton("CSE");
        JRadioButton jr3 = new JRadioButton("ECE");
        JButton b = new JButton("Clear");
        jr1.setBounds(75,50,100,30);
        jr2.setBounds(75,100,100,30);
        jr3.setBounds(75,150,100,30);
        b.setBounds(85,200,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);
        bg.add(jr3);
        bg.add(b);
        f.add(jr1);
        f.add(jr2);
        f.add(jr3);
        f.add(b);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton button = (JRadioButton) e.getSource();
                if(button.getText().equalsIgnoreCase("IT")){
                    jr2.setEnabled(false);
                    jr3.setEnabled(false);
                } else if(button.getText().equalsIgnoreCase("CSE")){
                    jr1.setEnabled(false);
                    jr3.setEnabled(false);
                }else if(button.getText().equalsIgnoreCase("ECE")){
                    jr1.setEnabled(false);
                    jr2.setEnabled(false);
                }
            }
        };

        jr1.addActionListener(listener);
        jr2.addActionListener(listener);
        jr3.addActionListener(listener);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bg.clearSelection();
                jr1.setEnabled(true);
                jr2.setEnabled(true);
                jr3.setEnabled(true);
            }
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

    }
}
