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
    public class sky extends JComponent 
 {      
       private Color color = new Color (85, 206, 255);   
       private int height;
       private int width; 
       
       Random generator = new Random(); 
     public sky ()
     {
         
         
     }
     public void draw (Graphics2D page) 
     { 
        page.setColor(color); 
        page.drawRect(0,0,10000,700);
        page.fillRect(0,0,10000,700);
     }
    
     public void paintComponent(Graphics g)
     {
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
     }
     //what changes the colors of the sky to match the time of the day
     public void night(int r)
     {
         if (r > 60) 
         {
            color = new Color (211,211,211); 
         }
         
         if (r > 75)
         
         {
            
             color = new Color (41,0,94);
         }
         if (r >= 90)
         
         {
            
             color = new Color (0,0,0); 
         }
          
     }
      
}