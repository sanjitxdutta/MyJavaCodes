import javax.swing.*;
import java.awt.event.*;

public class reverseNum {
    public static void main(String [] args){
        JFrame frame =  new JFrame("Revers of digits");

        JLabel numLabel = new JLabel("Enter number");
        JTextField numTextField = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel();

        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String numInput = numTextField.getText();

                if(numInput.isEmpty()){
                    resultLabel.setText(" ");
                }
                else{
                    try{
                        int numValue = Integer.parseInt(numInput);
                        int reverse = 0;

                        while(numValue!= 0){
                            reverse = reverse * 10 + (numValue % 10);
                            numValue = numValue / 10;
                        }
                        resultLabel.setText("Reverse of digit: " + reverse);
                    }catch(Exception e){
                        resultLabel.setText(" ");
                    }
                }
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(numLabel);
        frame.add(numTextField);
        frame.add(submitButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
