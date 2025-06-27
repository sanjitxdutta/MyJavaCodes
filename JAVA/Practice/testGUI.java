import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testGUI {
    public static void main(String [] args){
        JFrame frame = new JFrame("Admission Counter");
        JLabel cseLabel = new JLabel("CSE Studrnt");
        JLabel csbsLabel = new JLabel("CSBE Student");
        JTextField cseCount = new JTextField(10);
        JTextField csbsCount = new JTextField(10);
        JButton submitButton = new JButton("Submit");
        JLabel resultLabel = new JLabel();


        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                String cseInput = cseCount.getText();
                String csbsInput = csbsCount.getText();

                if(cseInput.isEmpty() || csbsInput.isEmpty()){
                    resultLabel.setText("Count(s) can not be empty!");
                }
                else{
                    try{
                        int cseValue = Integer.parseInt(cseInput);
                        int csbsValue = Integer.parseInt(csbsInput);

                        if(cseValue<0 || csbsValue<0){
                            resultLabel.setText("Count(s) can not be negative!");
                        }
                        else{
                            resultLabel.setText("Total student count: "+ (cseValue+csbsValue));
                        }
                    }catch(NumberFormatException e){
                        resultLabel.setText("Count(s) should be a whole number");
                    }
                }
            }
        });


        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(250, 200);
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
