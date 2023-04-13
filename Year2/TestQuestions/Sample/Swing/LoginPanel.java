package Year2.TestQuestions.Sample.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel {

    LoginPanel(){
        JFrame frame = new JFrame("JPanel Demo Program");
        JPanel panel = new JPanel(new GridLayout(3,2,10,10));
        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"Login Panel"));

        JLabel l1, l2;
        JTextField t1, t2;
        l1 = new JLabel("Enter username:");
        t1 = new JTextField(30); // increased width of text field
        panel.add(l1);
        panel.add(t1);

        l2 = new JLabel("Enter password:");
        t2 = new JTextField(30); // increased width of password field
        panel.add(l2);
        panel.add(t2);

        JLabel emptyLabel = new JLabel();
        panel.add(emptyLabel);

        JButton login = new JButton("Login");
        login.setPreferredSize(new Dimension(100, 25)); // reduced button size
        JPanel buttonPanel = new JPanel(new GridLayout(1,1));
        buttonPanel.add(login);
        panel.add(buttonPanel);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = t1.getText();
                String password = t2.getText();
                if(username.equalsIgnoreCase("hmm") && password.equalsIgnoreCase("hmm"))
                    JOptionPane.showConfirmDialog(panel,"Logged in!");
                else
                    JOptionPane.showMessageDialog(panel,"Go away");
            }
        });

        frame.add(panel);
        frame.pack();
        frame.setSize(500,200);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new LoginPanel();
    }
}
