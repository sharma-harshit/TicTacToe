// error : size automatically decreases
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
public class JComboBox_exp extends JFrame
{
    JComboBox cb;
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel();
    JComboBox_exp()
    {
        setTitle("Jcombobox");
        setSize(500,700);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        cb= new JComboBox();
        setBounds(100,100,200,30);
        add(cb);
        cb.setModel(model);
        model.addElement("Java");
        model.addElement("JavaScript");
        model.addElement("ASP");
        model.addElement("Php");
        
    }
    public static void main(String[] args) 
    {
        new JComboBox_exp();
    }
}
