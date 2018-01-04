import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class swing_components extends JFrame
{
   
    JButton button1;
    
    swing_components()
    {
        //intializing our frame
        setVisible(true);
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Swing Components");
        //setting layout to personalize sizes of components
        setLayout(null);
        
        //Using button Component
            // button object creation
            button1 =new JButton("Click Here");
            //setting size for button
            button1.setBounds(100,100,200,30);
            //adding button
            add(button1);
            
        // Using label component
            JLabel label1 = new JLabel("Label Created");
            label1.setBounds(100,110,300,200);
            add(label1);
        //Using TextBox
            JTextField TextField1 = new JTextField();
            TextField1.setBounds(400,100,250,40);
            TextField1.setVisible(true);
            add(TextField1);
        
    }
    public static void main(String[] args)
    {
        new swing_components();
    }
}
