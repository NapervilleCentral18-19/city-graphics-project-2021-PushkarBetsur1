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
          y = 805; 
         length1 = length; 
         width1 = width; 
         color1 = color; 
         color2 = color.white; 
     }
     public void draw (Graphics2D page) 
     {
        page.setColor(color1); 
        page.fillRect(x,y,length1,-1*width1);
        //System.out.println(x + " " + " "+ (800-width1) + " " +" "+  width1 +" "+ length1);
        for (int i = 0; i <  length1/20; i++) 
        {
             for(int j = 0; j < width1 / 20; j ++)
         {
             page.setColor(color2);
               
              page.fillRect( x+9 + (i*20) , y-9 - (j*20),9,9);
           }
        }
     }
    
     public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        draw(g2);                 
    }
    //what the colors of the window are changed with 
    public void windowchange(int r) 
    {   if (r >= 75)
        {
           if (color2.equals(Color.white))
            {
                color2 = Color.yellow; 
            } 
        
        }
        if (r >= 90)
        {
            if (color2.equals(Color.yellow))
            {
                color2 = Color.blue; 
            }
            
        }
    
    
    }
    
}
