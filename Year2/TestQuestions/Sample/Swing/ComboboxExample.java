package Year2.TestQuestions.Sample.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboboxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Subject Selector");
        frame.setSize(400, 200);
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Selected Subject: ");

        String[] subjects = {"Math", "Science", "English", "History", "Art"};
        JComboBox<String> comboBox = new JComboBox<>(subjects);

        JTextField textField = new JTextField(10);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSubject = (String) comboBox.getSelectedItem();
                textField.setText(selectedSubject);
            }
        });

        panel.add(label);
        panel.add(comboBox);
        panel.add(textField);

        frame.add(panel);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
