import javax.swing.*;
import java.awt.event.*;

public class task5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Leap Year Checker");
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter Year:");
        label.setBounds(30, 30, 100, 30);
        frame.add(label);

        JTextField yearField = new JTextField();
        yearField.setBounds(120, 30, 150, 30);
        frame.add(yearField);

        JButton checkBtn = new JButton("Check");
        checkBtn.setBounds(120, 70, 100, 30);
        frame.add(checkBtn);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(30, 110, 300, 30);
        frame.add(resultLabel);

        checkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int year = Integer.parseInt(yearField.getText());
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        resultLabel.setText(year + " is a Leap Year");
                    } else {
                        resultLabel.setText(year + " is NOT a Leap Year");
                    }
                } catch (Exception ex) {
                    resultLabel.setText("Please enter a valid year.");
                }
            }
        });

        frame.setVisible(true);
    }
}
