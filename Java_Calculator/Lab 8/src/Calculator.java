import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;



public class Calculator {
    private JPanel Calculator;
    private JTextField textdisplay;
    private JButton period;
    private JButton Number0;
    private  JButton Number1;
    private JButton Number2;
    private JButton Number3;
    private JButton Number4;
    private JButton Number5;
    private JButton Number6;
    private JButton Number7;
    private JButton Number8;
    private JButton Number9;
    private JButton plus;
    private JButton minus;
    private JButton multiply;
    private JButton divide;
    private JButton equal;
    private JButton AC;

    double a, b, result;
    String op;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public Calculator() {
        Number0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number0.getText());
            }
        });
        Number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number1.getText());
            }
        });
        Number2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number2.getText());
            }
        });
        Number3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number3.getText());
            }
        });
        Number4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number4.getText());
            }
        });
        Number5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number5.getText());
            }
        });
        Number6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number6.getText());
            }
        });
        Number7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number7.getText());
            }
        });
        Number8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number8.getText());
            }
        });
        Number9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText(textdisplay.getText() + Number9.getText());
            }
        });
//        ========================================================Operators===============================================
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "+";
                textdisplay.setText("");
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "-";
                textdisplay.setText("");
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "*";
                textdisplay.setText("");
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textdisplay.getText());
                op = "/";
                textdisplay.setText("");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(textdisplay.getText());

                if (op == "+")
                {
                    result = a + b;
                    textdisplay.setText(String.valueOf(result));
                }
                else if(op == "-")
                {
                    result = a - b;
                    textdisplay.setText(String.valueOf(result));
                }
                else if(op == "*")
                {
                    result = a * b;
                    textdisplay.setText(String.valueOf(result));
                }
                else if(op == "/")
                {
                    result = a / b;
                    textdisplay.setText(String.valueOf(result));
                }
            }
        });

        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textdisplay.setText("");
            }
        });
//        ========================================================Non Values==============================================

        period.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textdisplay.getText().contains("."))
                {
                    textdisplay.setText(textdisplay.getText() + period.getText());
                }
            }
        });
    }
}

