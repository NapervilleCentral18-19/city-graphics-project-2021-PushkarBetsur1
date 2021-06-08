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
    public class ufo extends JComponent 
 {      
       private Color color,color1 ;   
       private int height;
       private int width; 
       private int a,b,x,y; 
       Random generator = new Random(); 
     public ufo ()
     {
        a = 1050; 
        b = 1050;
        x = 1090; 
        y = 1045; 
        color = Color.green; 
        color1 = Color.white; 
         
     }
     public void draw (Graphics2D page) 
     {
         
        page.setColor(color); 
        page.drawOval(a,b,100,15);
        page.fillOval(a,b,100,15);
        page.setColor(color1); 
        page.drawOval(x,y,20,15); 
        page.fillOval(x,y,20,15);
     }
    
     public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
    }
    
    
    // starts animation from the bottom 
    public void hover(int r)
    {
        if (r >= 90 && r < 142)
        {
             a -= 0;
             b -= 18; 
             x -= 0; 
             y -= 18; 
        }
        
         
        }
    
 }