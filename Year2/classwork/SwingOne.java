package Year2.classwork;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingOne {
    public static void main(String[] args){
        JFrame f = new JFrame(); //create instance of JFrame
        JPasswordField value = new JPasswordField();
        JLabel l1, l2;
        l1 = new JLabel("First Label");
        l1.setBounds(50,500,100,50);
        l2 = new JLabel("Second Label");
        l2.setBounds(50,550,100,30);
        f.add(l1);
        f.add(l2);
        value.setBounds(50,600,100,30);
        f.add(value);
        JButton b = new JButton("Click"); //create instance of JButton
        final JTextField t = new JTextField();
        JTextArea ta = new JTextArea("Enter apples");
        ta.setBounds(50,250,200,200);
        f.add(ta);
        t.setBounds(50,100,200,30);
        f.add(t);
        b.setBounds(50,200,100,40); //x y width height
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("Welcome to JAVA Swing!");
            }
        });
        f.add(b); //add button in JFrame
        f.setSize(400,500);//width height
        f.setLayout(null); //using no layout managers
        f.setVisible(true); //making the frame visible
        b.setBackground(Color.BLACK);
        b.setForeground(Color.white);
    }
}
