// 4. Develop a GUI to convert temperature in Fahrenheit to Celsius
import javax.swing.*;
import java.awt.event.*;

public class task4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fahrenheit to Celsius");
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //useless ig

        JLabel label1 = new JLabel("Fahrenheit:");
        label1.setBounds(30, 30, 100, 30);
        frame.add(label1);

        JTextField fahrenheitField = new JTextField();
        fahrenheitField.setBounds(120, 30, 150, 30);
        frame.add(fahrenheitField);

        JButton convertBtn = new JButton("Convert");
        convertBtn.setBounds(120, 70, 100, 30);
        frame.add(convertBtn);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(30, 110, 300, 30);
        frame.add(resultLabel);

        convertBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double f = Double.parseDouble(fahrenheitField.getText());
                    double c = (f - 32) * 5 / 9; // f = (c * 9 / 5) + 32
                    resultLabel.setText("Celsius: " + String.format("%.2f", c));
                } catch (Exception ex) {
                    resultLabel.setText("Invalid input! Enter a number.");
                }
            }
        });

        frame.setVisible(true);
    }
}
