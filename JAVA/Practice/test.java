import javax.swing.JFrame;
import javax.swing.JLabel;

public class test {
    public static void main(String [] args){

        //CREATE A LABEL
        JLabel label = new JLabel();
        label.setText("Bro do you even code?");

        //Create JFrame

        JFrame frame = new JFrame();
        frame.setTitle("JFrame title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        //frame.setSize(420, 420);
        frame.setVisible(true);

        //add label to the frame

        frame.add(label);
        frame.pack();
    }
}
