  import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
/**
 * Write a description of class road here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class road extends JComponent
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class road
     */
    public road()
    {
       
    }
    
    public void draw (Graphics2D page) 
     {
          
        page.setColor(Color.black); 
        page.drawRect(0,800,2000,200); 
        page.fillRect(0,800,2000,200);  
        page.setColor(Color.gray);
        page.drawRect(0,750,2000,70); 
        page.fillRect(0,750,2000,70); 
     }
    
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
    }
}
