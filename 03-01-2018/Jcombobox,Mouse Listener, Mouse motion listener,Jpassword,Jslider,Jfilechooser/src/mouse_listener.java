//importing required MouseListener Interface
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class mouse_listener extends JFrame implements MouseListener
{
    JButton bt;
    JLabel lb;
    mouse_listener()
    {
        //intializing frame
        setTitle("Mouse Listener Implentation");
        setSize(1000,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //intializing button
        bt= new JButton("Click here");
        bt.setBounds(100,100,200,50);
        add(bt);
        //intializing label
        lb = new JLabel();
        lb.setBounds(100,300,200,50);
        add(lb);
        bt.addMouseListener(this);
    }
    public static void main(String[] args) 
    {
        new mouse_listener();
    }
    //Overiding all abstract methods of the MouseListener interface
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        if(e.getSource() == bt)
        {
            lb.setText("You Clicked the button");
        }
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
       if(e.getSource() == bt)
        {
            lb.setText("You have pressed the button");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        if(e.getSource() == bt)
        {
            lb.setText("You Released the button");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        if(e.getSource() == bt)
        {
            lb.setText("Your pointer entered");
        }
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        if(e.getSource() == bt)
        {
            lb.setText("Your pointer exited");
        }
    }
}
