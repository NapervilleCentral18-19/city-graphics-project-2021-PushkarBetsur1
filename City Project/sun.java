
   import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;
 
    /**
     * Write a description of class building here.
     *
     * @author (your name)
     * @version (a version number or a date)
     */
    public class sun extends JComponent 
 {      
       private Color color = new Color (253, 184, 19) ;   
       private int height;
       private int width; 
       private int a,b; 
       Random generator = new Random(); 
     public sun ()
     {
        a = 100; 
        b = 50; 
         
     }
     public void draw (Graphics2D page) 
     {
         
        page.setColor(color); 
        page.drawOval(a,b,100,90);
        page.fillOval(a,b,100,90);
     }
    
     public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
    }
    
    public void moon(int m)
    {   if (m >= 60)
        {
         color = new Color(240,230,140);

        }
        if (m >= 75)
        {
           color = new Color(255,174,66);
        }
        if (m >= 90)
        {
             color = Color.white;  
        }
        
    }
    
    public void move(int r)
    {
        if (r < 90)
        {
             a += 18;
             b += 0; 
        }
        
         
        }
    
 }