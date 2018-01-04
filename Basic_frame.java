
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class J_Progress_Bar extends JFrame
{
    public J_Progress_Bar()
    {
        //intializing frame
        setLayout(null);
        setVisible(true);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        new J_Progress_Bar();
    }
}
