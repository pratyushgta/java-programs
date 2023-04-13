package Year2.TestQuestions.Sample.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator {
    String input = "";
    ArrayList<String> operator = new ArrayList<>();
    ArrayList<Integer> operand = new ArrayList<>();

    Calculator() {
        JFrame frame = new JFrame("DeCalculator");
        JPanel panel = new JPanel(new GridLayout(4, 4));
        JTextField result = new JTextField();
        result.setText("|");
        result.setEditable(false);
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(result, BorderLayout.NORTH);
        frame.setSize(300, 300);

        String[] buttons = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "CLR", "0", "=", "+"};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton(buttons[i * 4 + j]);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String clicked = button.getText();
                        if (clicked.equalsIgnoreCase("CLR")) {
                            input = "";
                            operand.clear();
                            operator.clear();
                            result.setText("|");
                        } else if (clicked.equalsIgnoreCase("+") || clicked.equalsIgnoreCase("-") || clicked.equalsIgnoreCase("*") || clicked.equalsIgnoreCase("/")){
                            operand.add(Integer.parseInt(input));
                            operator.add(clicked);
                            result.setText("|");
                            input="";
                        }
                        else if (clicked.equalsIgnoreCase("=")) {
                            operand.add(Integer.parseInt(input));
                            if (operator.size() != operand.size()+1) {
                                String r = calculate();
                                result.setText(r);
                            } else {
                                result.setText("Syntax Error :/");
                            }

                        } else{
                            input += clicked;
                            result.setText(input);

                        }
                    }
                });
                panel.add(button);
            }
        }
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

    }

    String calculate() {
        System.out.println(operand + " "+operator);
        int result = operand.get(0);
        System.out.println(result);
        for (int i = 1; i <= operator.size(); i++) {
            int oprnd = operand.get(i);
            String oprtor = operator.get(i-1);
            //System.out.println(i+"> Operand: "+oprnd+" Operator: "+oprtor+" Result: "+result);
            switch (oprtor) {
                case "+":
                    result += oprnd;
                    break;
                case "-":
                    result -= oprnd;
                    break;
                case "*":
                    result *= oprnd;
                    break;
                case "/":
                    result /= oprnd;
                    break;
                default:
                    return "Syntax Error: [CALC]";
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
