package GUI;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author JMansilla
 */
public class VVPal extends JFrame
{

    PPal p;

    public VVPal(String title){
        super(title);
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p=new PPal(this);
        this.setContentPane(p);
        
    }
    
    
    
}
