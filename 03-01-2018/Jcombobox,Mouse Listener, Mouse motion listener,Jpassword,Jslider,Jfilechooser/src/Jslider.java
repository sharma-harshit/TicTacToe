//error : not  showing anything
import javax.swing.JFrame;
import javax.swing.JSlider;
public class Jslider extends JFrame 
{
    JSlider js;
    Jslider()
    {
        //intializing frame
        
        setLayout(null);
        setTitle("Mouse Listener Implentation");
        setSize(700,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //intializing slider
        JSlider js =new JSlider();
            //enabling ticks
            js.setPaintTicks(true);
            // setting spacing
            js.setMinorTickSpacing(10);
            //enabling labels
            js.setPaintLabels(true);
            // setting major spacing
            js.setMajorTickSpacing(20);
        
        
    }
    public static void main(String[] args) 
    {
        new Jslider();
    }
}
