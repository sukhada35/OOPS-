// Implement user interface to calculate BMI and display result in Text Field. 
import javax.swing.*;
import java.awt.event.*;

public class task2 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Enter weight (kg):");
        label1.setBounds(50, 50, 120, 30);
        frame.add(label1);

        JLabel label2 = new JLabel("Enter height (cm):");
        label2.setBounds(50, 90, 120, 30);
        frame.add(label2);

        JTextField field1 = new JTextField();
        field1.setBounds(180, 50, 150, 30);
        frame.add(field1);

        JTextField field2 = new JTextField();
        field2.setBounds(180, 90, 150, 30);
        frame.add(field2);

        JButton calculate = new JButton("Calculate BMI");
        calculate.setBounds(150, 130, 120, 30);
        frame.add(calculate);

        JLabel resultLabel = new JLabel("BMI: ");
        resultLabel.setBounds(150, 180, 200, 30);
        frame.add(resultLabel);
        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                try {
                    double weight = Double.parseDouble(field1.getText());
                    double height = Double.parseDouble(field2.getText()) / 100; 
                    double bmi = weight / (height * height);
                    resultLabel.setText("BMI: " + String.format("%.2f", bmi));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}