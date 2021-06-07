
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
    public class building extends JComponent 
 {      
       private Color color1,color2;   
       private int x,y,length1,width1,x2; 
       
       Random generator = new Random(); 
     public building(int xpos, int ypos, int length, int width, Color color)
     {
          x = xpos;
          y = ypos; 
         length1 = length; 
         width1 = width; 
         color1 = color; 
         color2 = color.white; 
     }
     public void draw (Graphics2D page) 
     {
        page.setColor(color1); 
        page.drawRect(x,800-width1,length1,width1);
        page.fillRect(x,800-width1,length1,width1);
        for (int i = 0; i < width1; i++)
        {
             for(int j = 0; j < length1 / 20; j ++)
          {
              page.setColor(color2);
              page.fillRect( x2 + 20 * j, 800 - 20 * i, - 10,10);
            }
        }
     }
    
     public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
    }
    
    
}
