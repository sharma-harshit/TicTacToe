import javax.swing.JFrame;
import javax.swing.JPasswordField;
public class Jpassword extends JFrame
{
    JPasswordField pf;
    public Jpassword() 
    {
        //intializing frame
        setLayout(null);
        setVisible(true);
        setSize(1000,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Using password field");
        setLocationRelativeTo(null);
        //intializing Password Field
        pf = new JPasswordField();
        pf.setBounds(100,100,100,50);
        add(pf);
        //changing the visible character
        pf.setEchoChar('%');
        //to get password
        System.out.println(pf.getPassword());
    }
    
    public static void main(String[] args) 
    {
        new Jpassword();
    }
}
