import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
//importing event class
import java.awt.event.ActionEvent;
//importing listener interface
import java.awt.event.ActionListener;
public class listening_single_action_events extends JFrame implements ActionListener
{
    //other functions also have to use these objects
    JLabel label;
    JButton button ;
    listening_single_action_events()
    {
        setVisible(true);
        setTitle("Action handling");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,700);
        setLayout(null);
        
        button= new JButton("Click Here!!!");
        button.setBounds(100,100,300,50);
        add(button);
        // associating action listener with this button
        button.addActionListener(this);
                
        label = new JLabel();
        label.setBounds(100,300,200,50);
        add(label);
    }
    // Overriding 
    public void actionPerformed(ActionEvent e) 
    {
        label.setText("Clicked");
    }
    public static void main(String[] args)
    {
        new listening_single_action_events();
    }
}
