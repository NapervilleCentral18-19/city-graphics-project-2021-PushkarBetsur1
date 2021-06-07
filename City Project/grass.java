
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
    public class grass extends JComponent 
 {      
       private Color color;   
       private int height;
       private int width; 
       
       Random generator = new Random(); 
     public grass ()
     {
         
         
     }
     
     public void draw (Graphics2D page) 
     {
         
        page.setColor(new Color (7, 173, 98)); 
        page.drawRect(0,700,2000,700);
        page.fillRect(0,700,2000,700);
     }
    
     public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
    }
    
    
}

