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
    public class car extends JComponent 
 {      
       private Color color; 
       private Color color3 = new Color (255,255,255); 
       private int height;
       private int width; 
       private int a,b; 
       
       Random generator = new Random(); 
     public car (Color color1)
     {
         a = -100;
         b = 850; 
         color = color1; 
        
         
     }
     public void draw (Graphics2D page) 
     { 
         // makes the bottom of the car 
        page.setColor(color);
        page.drawRect(a,b,35,15); 
        page.drawRect(a+10,b-10,12,29); 
        page.fillRect(a,b,35,15);
        page.fillRect(a+10,b-10,12,29);
        // makes top of the car 
        page.setColor(color3); 
        page.drawOval(a+5,b+10,10,10);
        page.drawOval(a+25,b+10,10,10);
        page.fillOval(a+5,b+10,10,10);
        page.fillOval(a+25,b+10,10,10);
     }
    
     public void paintComponent(Graphics g)
     {  
        
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
    }
     public void drive (int r)
     {
         if (r > 0)
        {
             a += 10;
             b += 0; 
        }
          
     }
     
        
}