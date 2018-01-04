import javax.swing.JFrame;
// importing required  graphics class
import java.awt.Graphics;
//importing color class
import java.awt.Color;
public class Start_drawing extends JFrame
{
    // Intializing frame
    Start_drawing()
    {
        setVisible(true);
        setSize(700,500);
        setTitle("Let us Draw");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    // overiding a function named paint in java.awt.Graphics class        
    public void paint(Graphics g)
    {
        
        super.paint(g);
        // drawing a line from A(120,200) to B(300,480)
        g.drawLine(120,200,300,480);
        g.drawRect(100,120,50,100);
        g.fillRect(200,220,50,100);
        g.drawRoundRect(180,120,50,100,15,20);
        g.fillRoundRect(280,250,50,100,15,20);
        g.drawOval(250,250,100,150);
        g.drawArc(350, 350, 100,70, 90,180);
        //making new color with r-100 g-34 b-150
        Color c1 = new Color(100,34,150);
        //setting this color
        g.setColor(c1);
        g.fillRect(200,220,50,100);
        //making a polygon
        int[] x = {100,200,300,400,500};
        int[] y = {100,200,300,400,500};
        g.drawPolygon(x, y,5);
    }
    public static void main(String[] args)
    {
        new Start_drawing();
    }
}
