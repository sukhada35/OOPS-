// 3. Write a JavaX program with two buttons. When the first button is clicked, the label should display 
// "Button-1 clicked." Similarly, clicking the second button should change the label to "Button-2 clicked".
import javax.swing.*;
import java.awt.event.*;

public class task3 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Click Example");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click a button!");
        label.setBounds(90, 20, 150, 30);
        frame.add(label);

        JButton button1 = new JButton("Button 1");
        button1.setBounds(50, 70, 100, 30);
        frame.add(button1);

        JButton button2 = new JButton("Button 2");
        button2.setBounds(160, 70, 100, 30);
        frame.add(button2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button-1 clicked.");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button-2 clicked.");
            }
        });

        frame.setVisible(true);
    }
}
