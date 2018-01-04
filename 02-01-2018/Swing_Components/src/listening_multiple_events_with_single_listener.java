import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class listening_multiple_events_with_single_listener extends JFrame implements ActionListener
{
    //other functions also have to use these objects so declaring here
    JLabel label;
    JButton button1,button2 ;
    listening_multiple_events_with_single_listener()
    {
        setVisible(true);
        setTitle("Action handling");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,700);
        setLayout(null);
        
        button1= new JButton("Button 1");
        button1.setBounds(100,100,300,50);
        add(button1);
        button1.addActionListener(this);
        
        button2= new JButton("Button 2");
        button2.setBounds(500,100,300,50);
        add(button2);
        button2.addActionListener(this);
                
        label = new JLabel();
        label.setBounds(100,300,200,50);
        add(label);
    }
    // Overriding 
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==button1)
        label.setText("Button 1 is Clicked");
        else if(e.getSource()==button2)
        label.setText("Button 2 is Clicked");
    }
    public static void main(String[] args)
    {
        new listening_multiple_events_with_single_listener();
    }
}

