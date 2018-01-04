//importing required MouseListener Interface

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class mouse_motion_listener extends JFrame implements MouseMotionListener
{
    JLabel lb;
    mouse_motion_listener()
    {
        //intializing frame
        setTitle("Mouse Listener Implentation");
        setSize(1000,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
 
        //intializing label
        lb = new JLabel();
        lb.setBounds(100,300,200,500);
        add(lb);
        addMouseMotionListener(this);
    }
    public static void main(String[] args) 
    {
        new mouse_motion_listener();
    }
    //Overiding all abstract methods of the MouseMotionListener interface

    @Override
    public void mouseDragged(MouseEvent e) 
    {
           lb.setText("Dragged at x: "+getMousePosition().x+" y :"+getMousePosition().y);
    }

    @Override
    public void mouseMoved(MouseEvent e) 
    {
           lb.setText("Moved at x: "+getMousePosition().x+" y :"+getMousePosition().y);               
    }
    
}
