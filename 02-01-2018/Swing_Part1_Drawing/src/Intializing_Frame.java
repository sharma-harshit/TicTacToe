//importing Swing package's Jframe Class
import javax.swing.JFrame;
//Inherting features of Jframe a class so that our class becomes a frame
public class Intializing_Frame extends JFrame
{
    //Constructor giving our class i.e. frame a shape
    Intializing_Frame()
    {
        //Setting visibility of our frame
        setVisible(true);
        //Setting Size of our frame width - 500 and height - 500
        setSize(500,500);
        //Setting Title of our frame First Frame
        setTitle("First Frame");
        // Cross button closes our frame program
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // positioning our frame in center of our screen
        setLocationRelativeTo(null);
    }
    public static void main(String[] args)
    {
        // making a new object of our class so the constructor executes
        new Intializing_Frame();
    }
}
