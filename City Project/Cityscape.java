import java.awt.*;
    import java.util.*;

    import java.awt.Graphics;
    import java.awt.Graphics2D;
    import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author gcschmit
 * @version 18 July 2014
 */
public class Cityscape extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int x;
    private building building1;
    private building building2;
    private building building3; 
    private building building4; 
    private building building5; 
    private building building6; 
    private building building7; 
    private building building8;
    private building building9; 
    private building building10; 
    private sky sky1;
    private sun sun1; 
    private sun sun2; 
    private grass grass1; 
    private road road1;
    private int r = 0;
    private Color color;   
    private car car1; 
    private car car2;
    private car car3;
    private car car4; 
    private car car5; 
    private ufo ufo1; 
    
    // define the Cityscape contructor and intiailize all instance variables
    // ...
    //x,y,length1,width1
    public Cityscape() 
    {   sky1 = new sky(); 
        sun1 = new sun();
        grass1 = new grass();
        road1 = new road();
        car1 = new car(Color.BLUE);
        car2 = new car(Color.MAGENTA); 
        car3 = new car (Color.ORANGE); 
        car4 = new car(Color.RED); 
        car5 = new car(Color.YELLOW); 
        building1 = new building(10,100,100,235,Color.green);//200
        building2 = new building(125,100,200,342,Color.red);//450
        building3 = new building(350,100,150,523,Color.magenta);//600 
        building4 = new building(525,100,110,400,new Color (0,128,255));//860
        building5 = new building (700,100,130,390,Color.cyan); //1173
        building6 = new building(900,100,123,189,Color.orange); //1323
        building7 = new building (1050,100,210,600,Color.darkGray); //1800  
        building8 = new building (1300,100,110,210,new Color (229, 255, 204)); //1610
        building9 = new building (1500,100,150,290,Color.pink); //1850
        building10 = new building (1700,100,133,232,Color.lightGray); //2132
        ufo1 = new ufo(); 
       
        
    }
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     * 
     * @param g a reference to the Graphics object used for all drawing operations
     *
     */
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        sky1.draw(g2); 
        sun1.draw(g2); 
        grass1.draw(g2); 
        road1.draw(g2); 
        car1.draw(g2);
        car2.draw(g2);
        car3.draw(g2); 
        car4.draw(g2); 
        car5.draw(g2); 
        building1.draw(g2); 
        building2.draw(g2); 
         
        building2.draw(g2); 
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        building7.draw(g2);
        building8.draw(g2);
        building9.draw(g2);
        building10.draw(g2);
        ufo1.draw(g2);
        
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when
     *      they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
         r++; 
         car1.drive(r); 
         if (r > 10){
            car2.drive(r); }
         if (r > 35){
            car3.drive(r); }
         if (r > 60){
            car4.drive(r); }
         if (r > 75){
            car5.drive(r); }
         
         ufo1.hover(r); 
         sun1.move(r); 
         sun1.moon(r); 
         sky1.night(r);
         
        building1.windowchange(r);
        building2.windowchange(r);
        building3.windowchange(r);
        building4.windowchange(r);
        building5.windowchange(r);
        building6.windowchange(r);
        building7.windowchange(r);
        building8.windowchange(r);
        building9.windowchange(r);
        building10.windowchange(r);
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        //  do not explicitly invoke the paintComponent method
        repaint(); 
    }

}
