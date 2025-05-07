// Develop swing program to perform addition of two numbers… [Use JLabels, JButton, JTextField etc.]
import javax.swing.*;
import java.awt.event.*; 

public class task1 {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Addition of Two Numbers");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel label1 = new JLabel("Enter first number:");
        label1.setBounds(50, 50, 120, 30);
        frame.add(label1);

        JLabel label2 = new JLabel("Enter second number: ");
        label2.setBounds(50, 90, 120, 30);
        frame.add(label2);

        JTextField field1 = new JTextField();
        field1.setBounds(180, 50, 150, 30);
        frame.add(field1);

        JTextField field2 = new JTextField();
        field2.setBounds(180, 90, 150, 30);
        frame.add(field2);

        JButton addButton = new JButton("Add");
        addButton.setBounds(150, 130, 80, 30);
        frame.add(addButton);

        JLabel resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(150, 180, 200, 30);
        frame.add(resultLabel);

        addButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try {
                    int num1 = Integer.parseInt(field1.getText());
                    int num2 = Integer.parseInt(field2.getText());
                    int sum = num1 + num2;
                    resultLabel.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
