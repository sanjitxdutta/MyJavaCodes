import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class digitSum {
    public static void main(String [] args){
        JFrame frame = new JFrame("Sum of digits");
        JLabel numLabel = new JLabel("Enter number");
        JTextField numTextField = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel();

        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                String numInput = numTextField.getText();

                if(numInput.isEmpty()){
                    resultLabel.setText("Field(s) can not be empty!");
                }
                else{
                    try{
                        int numValue = Integer.parseInt(numInput);
                        
                        if(numValue < 0){
                            resultLabel.setText("Number must be positive!");
                        }
                        else{
                            int sum = 0;
                            while(numValue != 0){
                                sum += numValue % 10;
                                numValue = numValue/10;
                            }
                            resultLabel.setText("Sum of digit(s): " + sum);
                        }
                    }catch(Exception e){
                        resultLabel.setText("Count(s) should be a whole number");
                    }
                }
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(250, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(numLabel);
        frame.add(numTextField);
        frame.add(submitButton);
        frame.add(resultLabel);
        frame.setVisible(true);
    }
}
