import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall here.
 * 
 * @author (Ray Brandeberry) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{
    private String image;
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Wall( String imageName )
    {
        image = imageName;
        setImage( image );
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
