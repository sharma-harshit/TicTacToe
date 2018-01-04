import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class showing_dialogs extends JFrame implements ActionListener
{
    JButton bt1,bt2,bt3;
    showing_dialogs()
    {
        //intializing frame
        setTitle("Mouse Listener Implentation");
        setSize(1000,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //intializing buttons
        bt1 =  new JButton("Message Dialog");
        bt1.setBounds(50,50,200,50);
        add(bt1);
        bt1.addActionListener(this);
        
        bt2 =  new JButton("Confirm Dialog");
        bt2.setBounds(300,50,200,50);
        add(bt2);
        bt2.addActionListener(this);
        
        bt3 =  new JButton("Input Dialog");
        bt3.setBounds(550,50,200,50);
        add(bt3);
        bt3.addActionListener(this);
        //Message Dialog
        
    }
    public static void main(String[] args) 
    {
        new showing_dialogs();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            JOptionPane.showMessageDialog(this,"Hey there !!!");
        }
        else if(e.getSource()==bt2)
        {
            JOptionPane.showConfirmDialog(this, "Want to confirm","Confirmation Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
        }
        else if(e.getSource()==bt3)
        {
            String s = JOptionPane.showInputDialog(this,"Enter your name");
        }
    }
}
