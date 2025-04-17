import javax.swing.*;
import java.awt.event.*;

public class task7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Submit/Cancel Form");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton submitBtn = new JButton("SUBMIT");
        submitBtn.setBounds(50, 50, 90, 30);
        frame.add(submitBtn);

        JButton cancelBtn = new JButton("CANCEL");
        cancelBtn.setBounds(150, 50, 90, 30);
        frame.add(cancelBtn);

        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(50, 100, 200, 30);
        frame.add(statusLabel);

        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("submitted");
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("cancelled");
            }
        });

        frame.setVisible(true);
    }
}
