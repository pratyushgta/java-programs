package Year2.classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingOne {
    private static JDialog d;
    /*SwingOne() {
        JFrame f = new JFrame(); //create instance of JFrame
        d = new JDialog(f, "Dialog example", true);
        d.setLayout(new FlowLayout());
        JButton b = new JButton("Ok");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwingOne.d.setVisible(false);
            }
        });

        d.add(new JLabel("Click button to continue!"));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);

    }*/
    JFrame f;
    /*SwingOne(){
        f = new JFrame();
        JRadioButton r1 = new JRadioButton("A) B1");
        JRadioButton r2 = new JRadioButton("b) B2");

        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setSize(300,300);

        f.setLayout(null);
        f.setVisible(true);
    }*/

    public static void main(String[] args) {
        /*JFrame f = new JFrame(); //create instance of JFrame
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
        b.setForeground(Color.white);*/

        JFrame frame = new JFrame("Example Panel");
        JPanel panel = new JPanel();

        panel.setBounds(40,50,200,200);
        panel.setBackground(Color.gray);

        JButton b1 = new JButton("Bubbon 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Bubbon 2");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.black);

        JButton b3 = new JButton("Bubbon 3");
        b3.setBounds(50,200,80,30);
        b3.setBackground(Color.pink);

        JButton b4 = new JButton("Bubbon 4");
        b4.setBounds(100,200,80,30);
        b4.setBackground(Color.cyan);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);

        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        b1.setForeground(Color.white);
        b2.setForeground(Color.white);





         //new SwingOne();

    }
}
