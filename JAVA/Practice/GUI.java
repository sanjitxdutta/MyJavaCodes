import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Admission Counter");
        JLabel cseLabel = new JLabel("CSE Students:");
        JTextField cseCount = new JTextField(10);
        JLabel csbsLabel = new JLabel("CSBS Students:");
        JTextField csbsCount = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel();

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String cseInput = cseCount.getText();
                String csbsInput = csbsCount.getText();

                if (cseInput.isEmpty() || csbsInput.isEmpty()) {
                    resultLabel.setText("Count(s) cannot be empty");
                } else {
                    try {
                        int cseValue = Integer.parseInt(cseInput);
                        int csbsValue = Integer.parseInt(csbsInput);
                        if (cseValue < 0 || csbsValue < 0) {
                            resultLabel.setText("Count cannot be negative");
                        } else {
                            resultLabel.setText("Total Students: " + (cseValue + csbsValue));
                        }
                    } catch (NumberFormatException e) {
                        resultLabel.setText("Count should be a whole number");
                    }
                }
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.setBackground(255, 0, 0);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(cseLabel);
        frame.add(cseCount);
        frame.add(csbsLabel);
        frame.add(csbsCount);
        frame.add(submitButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
